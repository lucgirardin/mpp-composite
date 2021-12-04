package com.macrofocus.common

actual class Runtime {
    actual fun availableProcessors(): Int {
        return java.lang.Runtime.getRuntime().availableProcessors()
    }

    actual companion object {
        actual fun getRuntime(): Runtime {
            return Runtime()
        }
    }
}