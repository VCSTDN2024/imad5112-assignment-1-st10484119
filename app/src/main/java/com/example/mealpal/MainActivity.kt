package com.example.mealpal

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {


    private lateinit var Enter: EditText
    private lateinit var ClrBtn: Button
    private lateinit var ExtBtn: Button
    private lateinit var GenBtn: Button                  // establishing all variables //
    private lateinit var genTXT: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        ClrBtn = findViewById(R.id.ClrBtn)
        ExtBtn = findViewById(R.id.ExtBtn)               // ID's for all buttons//
        GenBtn = findViewById(R.id.GenBtn)
        Enter = findViewById(R.id.Enter)
        genTXT = findViewById(R.id.genTxt)


        ClrBtn.setOnClickListener() {
            Enter.text.clear()             // code for the clear button and function//
            genTXT.text = ""

        }

        ExtBtn.setOnClickListener() {
            finishAffinity()
            exitProcess(0)           // code for exit button//
        }

        GenBtn.setOnClickListener() {
            suggestfood()


        }
    }


    private fun suggestfood() {
        val timeOfDay = Enter.text.toString().trim()
        if (IsNotEmpty())

        when  (timeOfDay.toString().trim()) {
            "Breakfast" -> genTXT?.text = "Eggs \n \n Cereal \n \n Toast"
            "Morning Snack" -> genTXT?.text = "Sandwich \n \n Muffin \n \n Apple"
            "Lunch" -> genTXT?.text = "Sandwiches \n \n Ramen \n \n salad"
            "Snack" -> genTXT?.text = "Chips \n \n Nuts \n \n Popcorn"
            "Supper" -> genTXT?.text = "Butter Chicken \n \n Pasta \n \n Biryani"
            "Dessert" -> genTXT?.text = "Cake \n \n Ice-Cream  \n \n Mulva Pudding"
            "breakfast" -> genTXT?.text = "Eggs \n \n Cereal \n \n Toast"
            "morning snack" -> genTXT?.text = "Sandwich \n \n Muffin \n \n Apple"
            "lunch" -> genTXT?.text = "Sandwiches \n \n Ramen \n \n salad"
            "snack" -> genTXT?.text = "Chips \n \n Nuts \n \n Popcorn"
            "supper" -> genTXT?.text = "Butter Chicken \n \n Pasta \n \n Biryani"
            "dessert" -> genTXT?.text = "Cake \n \n Ice-Cream  \n \n Mulva Pudding"
            "dinner" -> genTXT?.text = "Butter Chicken \n \n Pasta \n \n Biryani"
            "Dinner" -> genTXT?.text = "Butter Chicken \n \n Pasta \n \n Biryani"





            else -> genTXT?.text = "Input Is Invalid"
// all code for the suggested meals//


        }


    }

    private fun IsNotEmpty(): Boolean {
        var b = true
        if (Enter?.text.toString().trim().isEmpty()){
            Enter?.error = "Input Required"
        }
        return b
    }

     /*
     Refrences
     Background image https://www.istockphoto.com/vector/kitchen-seamless-pattern-vector-background-gm475511846-65634849
      */






}



