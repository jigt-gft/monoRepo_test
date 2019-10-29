package com.gft.bazelapp9

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main_app1)
        
        //findViewById<TextView>(R.id.tv_label).text = "testing bazel from app1
        


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
