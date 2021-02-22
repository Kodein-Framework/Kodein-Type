import org.kodein.internal.gradle.settings.android

buildscript {
    repositories {
        mavenLocal()
        maven(url = "https://raw.githubusercontent.com/Kodein-Framework/kodein-internal-gradle-plugin/mvn-repo")
    }
    dependencies {
        classpath("org.kodein.internal.gradle:kodein-internal-gradle-settings:6.0.0-SNAPSHOT")
    }
}

apply { plugin("org.kodein.settings") }

rootProject.name = "Kodein-Type"

include(
    "kodein-type",
    "tests"
)
