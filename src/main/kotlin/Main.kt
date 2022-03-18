fun main() {
    val creditHrs: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18)

    println("How much is in state rent? ")
    val rentInState: Double = readln().toDouble()

    println("How much is out of state rent? ")
    val rentOutOfState: Double = readln().toDouble()

    runProgram(creditHrs, rentInState, rentOutOfState)
}

fun runProgram(crhs: Array<Int>, inStateRent: Double, outOfStateRent: Double) {
    println()
    println("\t\t\t In State, Fall/Spring")
    println("----------------------------------------------------")

    for (c in crhs) {
        println()
        println("$c Credit Hours at a rate of $129.18 per Credit Hour")
        println("In-State Rent: $inStateRent per month")
        println("$" + (((c * 129.18).div(4))).plus(inStateRent) + " total per month.")
    }

    println()
    println("\t\t\t\t In State, Summer")
    println("----------------------------------------------------")

    for (c in crhs) {
        println()
        println("$c Credit Hours at a rate of 129.18 per Credit Hour")
        println("In-State Rent: $inStateRent per month")
        println("$" + ((c * 129.18).div(3)).plus(inStateRent) + " total per month.")
    }

    println()
    println("\t\t\t Out Of State, Fall/Spring")
    println("----------------------------------------------------")

    for (c in crhs) {
        println()
        println("$c Credit Hours at a rate of $552.65 per Credit Hour")
        println("Out-of-State Rent: $outOfStateRent per month")
        println("$" + ((c * 552.65).div(4)).plus(outOfStateRent) + " total per month.")
    }

    println()
    println("\t\t\t\t Out Of State, Summer")
    println("----------------------------------------------------")

    for (c in crhs) {
        println()
        println("$c Credit Hours at a rate of $552.65 per Credit Hour")
        println("Out-of-State Rent: $outOfStateRent per month")
        println("$" + ((c * 552.65).div(3)).plus(outOfStateRent) + " total per month.")
    }
}