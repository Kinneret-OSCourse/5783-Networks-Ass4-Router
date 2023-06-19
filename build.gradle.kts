plugins {
    id("java")
    application
}

group = "il.ac.kinneret.networks"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    // Define the main class for the application.
    mainClass.set("il.ac.kinneret.networks.Router")
}

tasks.getByName<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "il.ac.kinneret.networks.Router"
    }
}
