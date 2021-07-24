plugins {
    kotlin("jvm") version "1.5.21"
}

group = "com.leetcode"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testCompileOnly("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
    testImplementation("org.assertj:assertj-core:3.19.0")
    testImplementation(kotlin("reflect"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
