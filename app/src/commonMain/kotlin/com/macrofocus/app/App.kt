package com.macrofocus.app

import com.macrofocus.common.*
import com.macrofocus.common.getPlatformName

class App {
    val greeting: String
        get() {
            return "Hello, ${getPlatformName()} with ${Runtime.getRuntime().availableProcessors()} processors"
        }
}

//fun main() {
//    println(App().greeting)
//}