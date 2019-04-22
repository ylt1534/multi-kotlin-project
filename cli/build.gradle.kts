plugins {
    kotlin("jvm")
    war
    id("org.jetbrains.kotlin.plugin.spring") version "1.3.30"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":log-config"))
    testRuntimeOnly("org.springframework.boot:spring-boot-starter-tomcat:2.1.3.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-web:2.1.3.RELEASE")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.1.3.RELEASE")
}

tasks.getByName<War>("war") {
    archiveName = "cli.war"
//    mainClassName = "wap.hr.recruiting.biz.masterdata.MasterDataMaintainenceServiceKt"
}