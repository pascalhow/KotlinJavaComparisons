package com.pascalhow.kotlinlearnings.cases;

public interface Vehicle {

    class Car implements Vehicle {
    }

    class Bus implements Vehicle {
    }

    class Motorcycle implements Vehicle {
    }

    class Cases {
        public String returnTypeName(Vehicle vehicle) {
            if (vehicle instanceof Car) {
                return "Car";
            } else if (vehicle instanceof Bus) {
                return "Bus";
            } else if (vehicle instanceof Motorcycle) {
                return "Motocycle";
            } else {
                throw new IllegalArgumentException("Vehicle not found!");
            }
        }
    }
}
