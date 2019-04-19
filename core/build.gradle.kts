plugins {
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter-web:2.1.3.RELEASE")
    implementation(project(":cli"))
    testImplementation(project(":config"))
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.1.3.RELEASE")
}
