pluginManagement {
    includeBuild("build-plugins")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
        mavenLocal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }

        mavenLocal()
    }
}

rootProject.name = "Island Recorder"
include(
    ":app",
    ":app-process",
    ":hidden-api"
)
