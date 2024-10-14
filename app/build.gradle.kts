plugins {
    id("application")
    alias(libs.plugins.kotlin.jvm)
    id("io.gatling.gradle") version "3.12.0.3"
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "org.example.AppKt"
}
