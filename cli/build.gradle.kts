plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":log-config"))
    implementation("org.springframework.boot:spring-boot-starter-web:2.1.3.RELEASE")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.1.3.RELEASE")
}
