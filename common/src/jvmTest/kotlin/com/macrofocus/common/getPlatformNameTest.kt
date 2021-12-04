package com.macrofocus.common

import kotlin.test.Test
import kotlin.test.assertNotNull

class getPlatformNameTest {
    @Test fun platformNameIsCorrect() {
        val platformName = getPlatformName()
        assertNotNull(platformName, "jvm")
    }
}