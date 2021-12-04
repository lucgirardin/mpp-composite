pluginManagement {
    plugins {
        kotlin("multiplatform") version "1.6.0" apply false
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
