package com.gft.library1

import org.junit.Test
import com.gft.bazelmolecule2.MoleculeFunction2

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Molecule2FunctionTest {
    @Test
    fun Molecule_isCorrect() {
        val moleculeFunction = MoleculeFunction2()
        val resultMolecule = moleculeFunction.getMolecule2(2)
        assertEquals("Molecule 2",resultMolecule)
    }
}
