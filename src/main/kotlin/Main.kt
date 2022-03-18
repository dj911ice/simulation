fun main() {
    val creditHrs: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18)

    println("How much is in-state rent? ")
    val rentInState: Double = readln().toDouble()

    println("What is in-state tuition per credit hour? ")
    val tuitionInState = readln().toDouble()

    println("How much is out of state rent? ")
    val rentOutOfState: Double = readln().toDouble()

    println("What is out of state tuition per credit hour? ")
    val tuitionOutOfState = readln().toDouble()

    runProgram(creditHrs, rentInState, tuitionInState, rentOutOfState, tuitionOutOfState)
}

fun runProgram(
    crhs: Array<Int>, inStateRent: Double, inStateTuition: Double,
    outOfStateRent: Double, outOfStateTuition: Double
) {
    println()
    println("\t\t\t In State, Fall/Spring")
    println("----------------------------------------------------")

    for (c in crhs) {
        println()
        println("$c Credit Hours at a rate of $inStateTuition per Credit Hour")
        println("In-State Rent: $inStateRent per month")
        println("$" + (((c * inStateTuition).div(4))).plus(inStateRent) + " total per month.")
    }

    println()
    println("\t\t\t\t In State, Summer")
    println("----------------------------------------------------")

    for (c in crhs) {
        println()
        println("$c Credit Hours at a rate of $inStateTuition per Credit Hour")
        println("In-State Rent: $inStateRent per month")
        println("$" + ((c * inStateTuition).div(3)).plus(inStateRent) + " total per month.")
    }

    println()
    println("\t\t\t Out Of State, Fall/Spring")
    println("----------------------------------------------------")

    for (c in crhs) {
        println()
        println("$c Credit Hours at a rate of $outOfStateTuition per Credit Hour")
        println("Out-of-State Rent: $outOfStateRent per month")
        println("$" + ((c * outOfStateTuition).div(4)).plus(outOfStateRent) + " total per month.")
    }

    println()
    println("\t\t\t\t Out Of State, Summer")
    println("----------------------------------------------------")

    for (c in crhs) {
        println()
        println("$c Credit Hours at a rate of $outOfStateTuition per Credit Hour")
        println("Out Of State Rent: $outOfStateRent per month")
        println("$" + ((c * outOfStateTuition).div(3)).plus(outOfStateRent) + " total per month.")
    }
}