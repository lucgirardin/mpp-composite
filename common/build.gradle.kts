plugins {
    kotlin("multiplatform") version "1.5.31"
}

group = "com.macrofocus"
version = "1.0.0"

repositories {
    mavenCentral()
}

kotlin {
    jvm()

    js {
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

    sourceSets {
        val commonMain by getting {
            dependencies {
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting { /* ... */ }
        val jvmTest by getting { /* ... */ }
        val jsMain by getting { /* ... */ }
        val jsTest by getting { /* ... */ }
    }
}