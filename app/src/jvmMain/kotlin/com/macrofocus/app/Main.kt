package com.macrofocus.app

import java.io.IOException

object Main {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println(App().greeting)
    }
}

//fun main() {
//    println(App().greeting)
//}