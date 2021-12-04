package com.macrofocus.common

expect class Runtime {
    fun availableProcessors(): Int

    companion object {
        fun getRuntime() : Runtime
    }
}