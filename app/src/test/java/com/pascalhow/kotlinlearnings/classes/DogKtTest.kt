package com.pascalhow.kotlinlearnings.classes

import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class DogKtTest {
    @Before
    fun setUp() {

        val ninJa = Dog("NinJa", 5, true)
        val goofy = DogKt("Goofy", 3, isTrained = false)
    }

}
