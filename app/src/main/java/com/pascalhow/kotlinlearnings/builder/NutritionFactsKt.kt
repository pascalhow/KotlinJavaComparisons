package com.pascalhow.kotlinlearnings.builder

data class NutritionFactsKt (var servingSize: Int,
                             var servings: Int,
                             var calories: Int = 0,
                             var fat: Int = 0,
                             var sodium: Int = 0,
                             var carbohydrate: Int = 0) {

    override fun toString(): String {
        return "NutritionFactsKt(servingSize=$servingSize, servings=$servings, calories=$calories, fat=$fat, sodium=$sodium, carbohydrate=$carbohydrate)"
    }

}
