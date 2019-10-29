package com.gft.bazelmolecule1

import com.gft.bazelatom1.AtomFunction1

class MoleculeFunction1 {

    fun getMolecule1(numero: Int): String {
        val name: String = "molecule function"
        val name2: String = "molecule function 2"

        val atom1 = AtomFunction1()
        val result1: String = atom1.getAtom1(1)
        println(result1)
        return result1

    }

    fun getMolecule2(numero: Int): String {
        val name: String = "molecule function"
        val name2: String = "molecule function 2"
        return name + numero.toString()
        
    }
    
}