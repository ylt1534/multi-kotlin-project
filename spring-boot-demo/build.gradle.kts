plugins {
    kotlin("jvm")
    java
    eclipse
    idea
    id("org.springframework.boot") version "2.1.6.RELEASE"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.springframework.boot:spring-boot-starter-web:2.1.4.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.1.4.RELEASE")
    implementation("org.hibernate.javax.persistence:hibernate-jpa-2.1-api:1.0.2.Final")
    implementation("javax.validation:validation-api:2.0.1.Final")
    implementation("org.hibernate:hibernate-core:4.1.4.Final")
    implementation("org.hibernate:hibernate-entitymanager:5.2.3.Final")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.40")
    runtimeOnly("mysql:mysql-connector-java:8.0.16")
    // necessary for @GeneratedValue @Id
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.1.4RELEASE")
}
