package com.macrofocus.common

actual class Runtime {
    actual fun availableProcessors(): Int {
        return 1
    }

    actual companion object {
        actual fun getRuntime(): Runtime {
            return Runtime()
        }
    }
}