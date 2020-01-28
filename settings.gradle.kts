buildscript {
    repositories {
        mavenLocal()
        maven(url = "https://dl.bintray.com/kodein-framework/Kodein-Internal-Gradle")
    }
    dependencies {
        classpath("org.kodein.internal.gradle:kodein-internal-gradle-settings:2.10.4-eap")
    }
}

apply { plugin("org.kodein.settings") }

rootProject.name = "Kodein-Type"

include(
        "kodein-type",
        ""
)
