pluginManagement {
    plugins {
        kotlin("multiplatform") version "1.6.0" apply false
    }
}

rootProject.name = "mpp-composite"

includeBuild("common") {
    dependencySubstitution {
        substitute(module("com.macrofocus:common")).using(project(":"))
    }
}
//includeBuild("app") {
//}
include(":app")