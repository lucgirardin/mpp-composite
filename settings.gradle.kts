rootProject.name = "mpp-composite"

includeBuild("common") {
    dependencySubstitution {
        substitute(module("com.macrofocus:common")).using(project(":"))
    }
}
includeBuild("app") {
}
//include(":app")