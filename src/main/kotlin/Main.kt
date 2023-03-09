fun main() {

 var car = Vehicles("Audi", "A3", "black", 4)
    car.carry(10)
    car.identify()
    println(car.calculateParkingFees(7))

    var matatu = Bus("Single deck", "B 10,5","white", 50)
    println(matatu.maxTripFare(80.5))
    println(matatu.calculateParkingFees(7))
}



open class Vehicles(var make: String, var model: String, var color: String, var capacity: Int) {

    open fun carry(people: Int) {
        var x = people - capacity

        if (people == capacity) {
            println("Carrying $people passengers")
        } else {
            println("Over the capacity by $x people")
        }

    }

    open fun identify() {
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }
}

    class Bus(make: String, model: String, color: String, capacity: Int): Vehicles(make, model, color, capacity) {
        fun maxTripFare(fare: Double): Double {
            var fare = fare * capacity
            return fare


        }

        override fun calculateParkingFees(hours: Int): Int {

            return hours * capacity
        }

    }