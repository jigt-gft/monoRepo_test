package com.gft.library1

import org.junit.Test
import com.gft.bazelmolecule1.MoleculeFunction1

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Molecule1FunctionTest {
    @Test
    fun Molecule_isCorrect() {
        val moleculeFunction = MoleculeFunction1()
        val resultAdd = moleculeFunction.getMolecule1(1)
        assertEquals("Atom 1",resultAdd)
    }
}
