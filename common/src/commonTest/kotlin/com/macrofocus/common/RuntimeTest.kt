package com.macrofocus.common

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class RuntimeTest {
    @Test fun processorsIsCorrect() {
        val platformName = getPlatformName()
        if(platformName == "js") {
            assertTrue(Runtime.getRuntime().availableProcessors() == 1)
        } else {
            assertTrue(Runtime.getRuntime().availableProcessors() > 1)
        }
    }
}