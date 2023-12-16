package machine

fun main() {
    val coffeeMaker = CoffeeMaker()
    do {
        println("Write action (buy, fill, take, remaining, exit):")
        val answer = readln()

        when (answer) {
            "remaining" -> {
                coffeeMaker.hasCoffeeMachine()
            }

            "buy" -> {
                coffeeMaker.buyCoffee()
            }

            "fill" -> {
                coffeeMaker.fillCoffeeMachine()
            }

            "take" -> {
                println("I gave you $${coffeeMaker.money}")
                coffeeMaker.money = 0
            }
        }
    } while (answer != "exit")

}



