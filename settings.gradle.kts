rootProject.name = "mpp-composite"

includeBuild("common") {
    dependencySubstitution {
        substitute(module("com.macrofocus:common")).using(project(":"))
    }
}
//includeBuild("app") {
//    dependencySubstitution {
//        substitute(module("com.macrofocus:app")).using(project(":"))
//    }
//}

include(":app")