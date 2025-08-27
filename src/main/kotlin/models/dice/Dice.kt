package models.dice

import kotlin.random.Random

class Dice {
    companion object {
        fun roll(type: Int): Int {
            when(type) {
                2,3,4,6,8,10,12,20,100 -> return Random.nextInt(1,type+1)
                else -> error("Forbidden parameter: $type")
            }
        }
        fun roll(type: Int, repetitions: Int): Int {
            when(type) {
                2,3,4,6,8,10,12,20,100 -> {
                    var sum: Int = 0
                    for (i in 1..repetitions) {
                        sum += roll(type)
                    }
                    return sum
                }
                else -> error("Forbidden parameter: $type")
            }
        }
    }
}