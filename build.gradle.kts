plugins {
    kotlin("jvm") version "2.0.0"
    id("jacoco")
}

group = "org.example"
version = "1.0-SNAPSHOT"

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
kotlin {
    jvmToolchain(21)
}
//tasks.test {
//    finalizedBy(tasks.jacocoTestReport)
//}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        csv.required = true
        html.required = true
    }
}