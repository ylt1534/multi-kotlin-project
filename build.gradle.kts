plugins {
    base
    kotlin("jvm") version "1.3.20" apply false
}

allprojects {

    group = "org.gradle.kotlin.dsl.samples.multiproject"

    version = "1.0"

    repositories {
        mavenCentral()
        jcenter()
    }
}

dependencies {
    // Make the root project archives configuration depend on every subproject
    subprojects.forEach {
        archives(it)
    }
}
