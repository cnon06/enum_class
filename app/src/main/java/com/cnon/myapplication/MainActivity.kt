package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


enum class meyveler
{
    Elma,Armut,Karpuz,Kavun,Üzüm,Muz

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(meyveler.Elma)
        println(meyveler.Armut)
        println(meyveler.Karpuz)
        println(meyveler.Kavun)
        println(meyveler.Üzüm)
        println(meyveler.Muz)


    }
}