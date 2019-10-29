package com.gft.bazelapp1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*
import com.gft.bazelorganisme1.OrganismeFunction1
import com.gft.bazelorganisme2.OrganismeFunction2


class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val organisme1 = OrganismeFunction1()
        val result1: String = organisme1.getOrganisme1(1)
        println("the result 1 is: ")
        println(result1)

        val organisme2 = OrganismeFunction2()
        val result2: String = organisme2.getOrganisme2(2)
        println("the result 2 is: ")
        println(result2)



        `kotlin_13_test`("testing 1 to 1, bazel rules for app1 ")
        
        //launchCoroutine()
    }

    private fun kotlin_13_test(x: String?) {
        if (!x.isNullOrEmpty()) {
            println("length of '$x' is ${x.length}") // Yay, smartcasted to not-null!
        }
    }

    private fun launchCoroutine() {
        GlobalScope.launch(context = Dispatchers.Default) {
            delay(1000)
            withContext(context = Dispatchers.Main) {
                findViewById<TextView>(R.id.tv_label).text = "Hello Bazel, from Kotlin And Coroutine!"
            }
        }
    }
}
