package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FizzBuzzServiceTest {

    val fb = FizzBuzzService()

    @Test
    fun `fizzBuzz should return Fizz for multiples of 3`() {
        assertEquals("Fizz", fb.fizzBuzz(3))
    }
}