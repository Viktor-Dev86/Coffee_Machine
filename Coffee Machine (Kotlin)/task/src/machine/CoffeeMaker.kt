package machine

class CoffeeMaker {
    private var water: Int = 400
    private var milk: Int = 540
    private var coffeeBeans: Int = 120
    private var disposableCups: Int = 9
    var money: Int = 550
    fun hasCoffeeMachine() {
        println("The coffee machine has:")
        println("$water ml of water ")
        println("$milk ml milk")
        println("$coffeeBeans g of coffee beans")
        println("$disposableCups disposable cups")
        println("$$money money")
    }

    fun buyCoffee() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back")
        val userAnswer = readln()
        if (userAnswer == "back") {
            return
        }
        val answerUserBuy = userAnswer.toInt()
        when (answerUserBuy) {
            1 -> {
                if (this.water >= 250) {
                    this.water -= 250
                } else {
                    println("Sorry, not enough $water!")
                    return
                }
                if (coffeeBeans >= 16) {
                    coffeeBeans -= 16
                } else {
                    println("Sorry, not enough $coffeeBeans!")
                    return
                }
                if (disposableCups > 0) {
                    disposableCups--
                } else {
                    println("Sorry, not enough $disposableCups!")
                    return
                }
                money += 4
                takeCoffee()
            }

            2 -> {
                if (water >= 350) {
                    water -= 350
                } else {
                    println("Sorry, not enough $water!")
                    return
                }
                if (coffeeBeans >= 20) {
                    coffeeBeans -= 20
                } else {
                    println("Sorry, not enough $coffeeBeans!")
                    return
                }
                if (disposableCups > 0) {
                    disposableCups--
                } else {
                    println("Sorry, not enough $disposableCups!")
                    return
                }
                if (milk >= 75) {
                    milk -= 75
                } else {
                    println("Sorry, not enough $milk!")
                    return
                }
                money += 7
                takeCoffee()
            }

            3 -> {
                if (water >= 200) {
                    water -= 200
                } else {
                    println("Sorry, not enough water!")
                    return
                }
                if (coffeeBeans >= 12) {
                    coffeeBeans -= 12
                } else {
                    println("Sorry, not enough coffeeBeans!")
                    return
                }
                if (disposableCups > 0) {
                    disposableCups--
                } else {
                    println("Sorry, not enough disposableCups!")
                    return
                }
                if (milk >= 100) {
                    milk -= 100
                } else {
                    println("Sorry, not enough milk!")
                    return
                }
                money += 6
                takeCoffee()
            }
        }
    }


    fun fillCoffeeMachine() {
        println("Write how many ml of water you want to add:")
        water += readln().toInt()
        println("Write how many ml of milk you want to add:")
        milk += readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        coffeeBeans += readln().toInt()
        println("Write how many disposable cups you want to add:")
        disposableCups += readln().toInt()
    }

    fun takeCoffee() {
        println("I have enough resources, making you a coffee!")
        println()
    }
}