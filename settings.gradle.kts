buildscript {
    repositories {
        mavenLocal()
        maven(url = "https://dl.bintray.com/kodein-framework/kodein-dev")
        maven(url = "https://dl.bintray.com/kodein-framework/Kodein-Internal-Gradle")
    }
    dependencies {
        classpath("org.kodein.internal.gradle:kodein-internal-gradle-settings:3.7.0-kotlin-1.4-M3-49")
    }
}

apply { plugin("org.kodein.settings") }

rootProject.name = "Kodein-Type"

include(
        "kodein-type",
        ""
)
