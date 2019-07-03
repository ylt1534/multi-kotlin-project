plugins {
    kotlin("jvm")
    java
    eclipse
    idea
    id("org.springframework.boot") version "2.1.6.RELEASE"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter-web:2.1.3.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.data:spring-data-jpa:2.1.9.RELEASE")
    // necessary for @GeneratedValue @Id
    implementation("org.hibernate.javax.persistence:hibernate-jpa-2.0-api:1.0.1.Final")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.1.3.RELEASE")
}
