package com.gft.library1

import org.junit.Test
import com.gft.library1.AddFunction

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AddFunctionUnitTest {
    @Test
    fun add_isCorrect() {
        val addFunction = AddFunction()
        val resultAdd = addFunction.add(10,10)
        assertEquals(21,resultAdd)
    }

    @Test
    fun add_isNotCorrect() {
        val addFunction = AddFunction()
        val resultAdd = addFunction.add(10,10)
        assertNotEquals(13,resultAdd)
    }
}
