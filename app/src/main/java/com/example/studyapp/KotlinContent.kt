package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_cell.*

class KotlinContent : AppCompatActivity() {
    lateinit var rv: RecyclerView
    lateinit var contentKotln: ArrayList<Content>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_content)
        rv = findViewById(R.id.rvk)
        title ="Kotlin Review"
        setUpContent()
        rv.adapter = RecyclerViewAdapter(contentKotln, this)
        rv.layoutManager = LinearLayoutManager(this)

    }

    fun setUpContent() {
        contentKotln = arrayListOf<Content>(
            Content(
                "val and var",
                "Declaring variables",
                "Mutable (changeable value) \n Ex:  val name : String = “areej” \n" +
                        "Immutable (unchangeable value) \n Ex: var num : Int = 0 "
            ), Content("User Input", "Take input from user", "Val input = readLine()"),
            Content(
                "Data Types",
                "Kotlin provides a set of built-in type",
                "val numInt : Int = 0\nval numFloat: Float = 0.0" +
                        "\nval numDouble : Double = 0.0\nval name:String = “areej”"
            ),
            Content("Basic Operations", "+ , - , * , / , %", "num1 + num2\nnum1*num2"),
            Content(
                "If Statements",
                "In Kotlin, if is an expression: it returns a value.",
                "If (condition) {\n" +
                        "Do something }\n" +
                        "Else{ do something }"
            ),
            Content(
                "Try/Catch", "It’s for Error handling", "Try {\n" +
                        "Statements\n" +
                        "}catch{\n" +
                        "Print error }"
            ),
            Content(
                "Loops",
                "repetition of certain sentences",
                "For loop \nIt used when you know the limit" +
                        " \nfor(number in 1..5){ println(number) }\n" +
                        "while loop\nIt used when you don’t know the limit of the loop \n" +
                        "var count = 0 while (count < 5){ count ++ println(count) }"
            ),
            Content(
                "When", "similar to a series of if statements", "when{\n" +
                        "1 -> print(“one”)\n" +
                        "Else -> print(“other”)"
            ),
            Content(
                "Import Random Module", "It’s make a random number",
                "val randomNumber = Random.nextInt(0,11)"
            ),
            Content(
                "Functions",
                " Functions are isolated chunks of code that we can call when we need them.",
                "May contain Arguments/Parameters and returns\n " +
                        "fun add(num1: Int, num2: Int): Int {\n " +
                        "return num1 + num2\n " +
                        "}\n " +
                        "println(add(4, 7))"
            ),
            Content(
                "Lists and Arrays", " Lists are immutable, we can’t make any changes to it.",
                " val pets = listOf(\"Fluffy\", \"Snoopy\", \"Spud\")\n Arrays are mutable. We can change each item at any time.\n " +
                        "val pets = arrayOf(\"Fluffy\", \"Snoopy\", \"Spud\")\n " +
                        "and they have fixed size"
            ),
            Content(
                "ArrayLists", " Array List is collections that do not have a fixed size",
                "val shoppingList = ArrayList()"
            ),
            Content(
                "2D ArrayLists",
                "Create 2D array",
                " credentials = arrayListOf<ArrayList<String>>()\n " +
                        "access to 2D array\n " +
                        "println(credentials[2][0])"
            ),
            Content(
                "Dictionary (Map)",
                " A Map allows us to create key value pairs",
                "val seats = mapOf(1 to \"Sara\", 2 to \"Jim\", 3 to \"Jane\")\n " +
                        "println(seats[2])  // --> Jim\n" +
                        "println(seats[0])  // --> null"
            ),
            Content(
                "OOP",
                "Object Oriented Programming)",
                "class exampleOne(val something: data type) -> class with argument\n" +
                        "{\n" +
                        "Do your program\n" +
                        "}"
            )
        )
    }

}