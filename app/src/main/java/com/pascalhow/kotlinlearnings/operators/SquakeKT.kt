package com.pascalhow.kotlinlearnings.operators

data class SquareKt(val width: Int, val height: Int) {
    operator fun plus(otherShape: SquareKt) = SquareKt(width + otherShape.width, height + otherShape.height)

    operator fun minus(otherShape: SquareKt) = SquareKt(width - otherShape.width, height - otherShape.height)

    operator fun times(otherShape: SquareKt) = SquareKt(width * otherShape.width, height * otherShape.height)
}
