package com.pascalhow.kotlinlearnings

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import com.pascalhow.kotlinlearnings.builder.NutritionFacts
import com.pascalhow.kotlinlearnings.builder.NutritionFactsKt
import com.pascalhow.kotlinlearnings.classes.Dog
import com.pascalhow.kotlinlearnings.classes.DogKt
import com.pascalhow.kotlinlearnings.extensions.PreferencesHelper
import com.pascalhow.kotlinlearnings.extensions.edit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dogLaunch()

        savePreferences()

        nutritionalFacts()
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
                .build()

        println("----- Nutritional Facts -----")
        println(lemonade.toString())
        println(sandwichSalami.toString())
    }

}
