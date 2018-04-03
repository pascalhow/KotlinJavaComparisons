package com.pascalhow.kotlinlearnings.cases

sealed class VehicleKt {
    class CarKt : VehicleKt()
    class BusKt : VehicleKt()
    class MotorcycleKt : VehicleKt()
}

fun returnTypeName(vehicleKt: VehicleKt): String = when (vehicleKt) {
    is VehicleKt.CarKt -> "Car"
    is VehicleKt.BusKt -> "Bus"
    is VehicleKt.MotorcycleKt -> "Motorcycle"
}
