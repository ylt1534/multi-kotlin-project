plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":core"))
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter:2.1.3.RELEASE")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.1.3.RELEASE")
}
