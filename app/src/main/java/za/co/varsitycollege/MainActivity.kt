package za.co.varsitycollege

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val reset = findViewById<Button>(R.id.reset)
        val textView = findViewById<TextView>(R.id.textViewMealSuggestions)
        val produce = findViewById<Button>(R.id.button2)
        val entertime= findViewById<EditText>(R.id.entertime)
        val food = findViewById<TextView>(R.id.textView)

        //the meals of the menu
        val morning= listOf("eggs and bread","coffee","pancakes","sausages and omelet","scramble eggs and tea")
        val middaybreak = listOf("pringles and juice","cake","youghurt","chocolate")
        val lunch = listOf("chip and chicken","meat and rice","pizza","fish and pap","fries and burger")
        val afternoonsnack = listOf("juice and cake","smoothie and biscuits","tea","grape","sandwich and grapetiser")
        val dinner = listOf("smash potatoes and meat","fries","hot soup and sandwitch","chocolate")
        produce.setOnClickListener {


            //if the user enter the wrong time
            if (entertime.text.toString() == "morning")
            {
                food.text = "hi here is your food${morning}"
            }
                else if (entertime.text.toString() == "middaybreak") {
                    food.text = "hi here is your food ${middaybreak}"
                }
                else if (
                    entertime.text.toString() == "lunch") {
                    food.text = "hi here is your food${lunch}"
                }
                else if (entertime.text.toString() == "afternoonsnack") {
                    food.text = "hi, here is your food ${afternoonsnack}"
//
                } else if (
                    entertime.text.toString() == "dinner") {
                    food.text = "hi,here is your afternoon snack${dinner}"
                }
            else {
                entertime.text.toString() == "      "
                food.text = "enter the correct time"
            }
        }
        reset.setOnClickListener {
            entertime.text.clear()
            food.text="food"
        }





         }
        }