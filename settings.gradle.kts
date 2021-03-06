pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
    }
    plugins {
        kotlin("multiplatform") version "1.5.10" apply false
    }
}

rootProject.name = "mpp-composite"

val composite: String by settings
when(composite) {
    "includeBuild" -> {
        includeBuild("common") {
            dependencySubstitution {
                substitute(module("com.macrofocus:common")).using(project(":"))
            }
        }
        includeBuild("app") {
        }
    }
    else -> {
        include(":common")
        include(":app")
    }
}
