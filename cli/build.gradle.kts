plugins {
    application
    kotlin("jvm")
}

application {
    mainClassName = "cli.Main"
}

dependencies {
    compile(project(":core"))
    compile(kotlin("stdlib"))
    compile("org.springframework.boot:spring-boot-starter:2.1.3.RELEASE")
}
