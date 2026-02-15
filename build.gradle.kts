val koin_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    kotlin("jvm") version "2.3.0"
    id("io.ktor.plugin") version "3.3.2"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.3.0"
}

group = "org.delcom"
version = "0.0.1"

application {
    mainClass.set("org.delcom.ApplicationKt")
}

kotlin {
    jvmToolchain(25)
}

repositories {
    mavenCentral()
}

dependencies {

    // =========================
    // KTOR
    // =========================
    implementation("io.ktor:ktor-server-core")
    implementation("io.ktor:ktor-server-netty")
    implementation("io.ktor:ktor-server-status-pages")
    implementation("io.ktor:ktor-server-content-negotiation")
    implementation("io.ktor:ktor-serialization-kotlinx-json")
    implementation("io.ktor:ktor-server-cors")
    implementation("io.ktor:ktor-server-default-headers")
    implementation("io.ktor:ktor-server-compression")
    implementation("io.ktor:ktor-server-caching-headers")
    implementation("io.ktor:ktor-server-conditional-headers")
    implementation("io.ktor:ktor-server-config-yaml")

    // =========================
    // DOTENV
    // =========================
    implementation("io.github.cdimascio:dotenv-kotlin:6.4.1")

    // =========================
    // KOIN
    // =========================
    implementation("io.insert-koin:koin-ktor:$koin_version")
    implementation("io.insert-koin:koin-logger-slf4j:$koin_version")

    // =========================
    // LOGGING
    // =========================
    implementation("ch.qos.logback:logback-classic:$logback_version")

    // =========================
    // ASYNC API
    // =========================
    implementation("org.openfolder:kotlin-asyncapi-ktor:3.1.3")

    // =========================
    // TEST
    // =========================
    testImplementation("io.ktor:ktor-server-test-host")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
