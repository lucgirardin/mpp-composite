group = "com.macrofocus"
version = "1.0.0"

val composite: String by project

allprojects {
    when (composite) {
        "include" -> {
            configurations.all {
                resolutionStrategy.dependencySubstitution {
                    //                substitute(
                    //                    module("com.macrofocus:common")
                    //                ).using(project(":common")).because("we work with the unreleased development version")

                    substitute(module("com.macrofocus:common")).using(project(":common"))
                }
            }
        }
    }
}