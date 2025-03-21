group = "org.example"
version = "1.0-SNAPSHOT"

plugins {
    //id("java")
    id("application")
    id("org.barfuin.gradle.taskinfo") version "2.2.0"
}

application {
    mainClass.set("org.example.Main") // 指定主类
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.compileJava {
    options.isDebug = false
}