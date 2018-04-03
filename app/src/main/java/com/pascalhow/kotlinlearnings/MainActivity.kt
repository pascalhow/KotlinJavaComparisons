@file:Suppress("UNUSED_VARIABLE")

package com.pascalhow.kotlinlearnings

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.pascalhow.kotlinlearnings.builder.NutritionFacts
import com.pascalhow.kotlinlearnings.builder.NutritionFactsKt
import com.pascalhow.kotlinlearnings.cases.Vehicle
import com.pascalhow.kotlinlearnings.cases.VehicleKt
import com.pascalhow.kotlinlearnings.cases.returnTypeName
import com.pascalhow.kotlinlearnings.classes.Dog
import com.pascalhow.kotlinlearnings.classes.DogKt
import com.pascalhow.kotlinlearnings.operators.Square
import com.pascalhow.kotlinlearnings.operators.SquareKt
import com.pascalhow.kotlinlearnings.extensions.PreferencesHelper
import com.pascalhow.kotlinlearnings.extensions.edit
import com.pascalhow.kotlinlearnings.lambdas.ButtonClick
import com.pascalhow.kotlinlearnings.lambdas.ButtonClickKt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dogLaunch()

        savePreferences()

        nutritionalFacts()

        buttonClick()

        cases()

        squares()
    }

    private fun dogLaunch() {
        val ninJa = Dog("NinJa", 5, true)
        val goofy = DogKt("Goofy", 3)
        val trainedGoofy = goofy.copy(isTrained = true)
        trainedGoofy.copy(isTrained = true)

        println("----- Dog Launch -----")
        println(ninJa)
        println(goofy)
        println(trainedGoofy)
    }

    private fun savePreferences() {
        val prefs = PreferenceManager.getDefaultSharedPreferences(applicationContext)

        prefs.edit {
            putString("name", "NinJa")
            putInt("age", 5)
        }

        val prefsJava = PreferencesHelper(applicationContext)
        prefsJava.putString("breed", "Poodle")
        prefsJava.putInt("height", 40)

        println("----- Save Preferences -----")
        println(prefs.getString("name", ""))
        println(prefs.getInt("age", 0))

        println(prefsJava.getString("name", ""))
        println(prefsJava.getInt("age", 0))
        println(prefsJava.getString("breed", "unknown"))
    }

    private fun nutritionalFacts() {
        val lemonade = NutritionFactsKt(servingSize = 240, servings = 8).apply {
            calories = 100
            sodium = 35
            carbohydrate = 27
        }

        val sandwichSalami = NutritionFacts.Builder(6, 1)
                .setCalories(370)
                .setSodium(0)
                .setFat(15)
                .setCarbohydrate(150)
                .build()

        println("----- Nutritional Facts -----")
        println(lemonade.toString())
        println(sandwichSalami.toString())
    }

    private fun buttonClick() {
        val buttonClick = ButtonClick(Button(this))
        val buttonClickKt = ButtonClickKt(Button(this))
        println("----- Button Click -----")
    }

    private fun cases() {
        val cases = Vehicle.Cases()
        println(cases.returnTypeName(Vehicle.Car()))
        println(cases.returnTypeName(Vehicle.Bus()))
        println(cases.returnTypeName(Vehicle.Motorcycle()))

        println(returnTypeName(VehicleKt.CarKt()))
        println(returnTypeName(VehicleKt.BusKt()))
        println(returnTypeName(VehicleKt.MotorcycleKt()))

        println("----- Cases -----")
    }

    private fun squares() {
        val square1 = Square(10, 20)
        println(square1.width)
        println(square1.height)
        val square2 = Square(20, 30)
        println(square2.width)
        println(square2.height)

        println(square1.sum(square2))
        println(square1.minus(square2))
        println(square1.times(square2))

        val squareKt1 = SquareKt(10, 20)
        println(squareKt1.width)
        println(squareKt1.height)

        val squareKt2 = SquareKt(20, 30)
        println(squareKt2.width)
        println(squareKt2.height)

        println(squareKt1 + squareKt2)
        println(squareKt1 - squareKt2)
        println(squareKt1 * squareKt2)

        println("----- Squares -----")
    }
}
