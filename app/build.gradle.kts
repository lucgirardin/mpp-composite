plugins {
    kotlin("multiplatform")
    id("maven-publish")
    application
}

group = "com.macrofocus"
version = "1.0.0"

repositories {
    mavenCentral()
}

val js: String by project
val jvm: String by project

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(8))
}

kotlin {
    if(jvm.toBoolean()) {
        jvm() {
            withJava()
        }
    }

    if(js.toBoolean()) {
        js(IR) {
            browser {
                webpackTask {
                    cssSupport.enabled = true
                }

                runTask {
                    cssSupport.enabled = true
                }

                testTask {
                    useKarma {
                        useChromeHeadless()
                        webpackConfig.cssSupport.enabled = true
                    }
                }
            }
            binaries.executable()
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("com.macrofocus:common:1.0")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        if(jvm.toBoolean()) {
            val jvmMain by getting { /* ... */ }
            val jvmTest by getting { /* ... */ }
        }

        if(js.toBoolean()) {
            val jsMain by getting { /* ... */ }
            val jsTest by getting { /* ... */ }
        }
    }
}

application {
    mainClass.set("com.macrofocus.app.Main")
}

