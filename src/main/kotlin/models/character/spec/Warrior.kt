package models.character.spec

import models.character.item.EquipedSlots
import models.dice.Dice
import kotlin.math.ceil

class Warrior(
    override val level: Int,
    override val skillMods: Map<String,Int>,
    override val equipedItems: EquipedSlots,
): iSpec {
    var hp: Int = 0
    var maxHp: Int = 0

    var ba: Int = 0
    var ca: Int = 0
    var jp: Int = 0

    init {
        if(level==1){
            maxHp = 10
            hp = maxHp
        } else if(level>1){
            maxHp = 10 + Dice.roll(10)
            hp = maxHp
        } else{
            error("Level must be 1 or greater")
        }
    }

    fun _calcJp(): Int{
        val x = ceil(level.toDouble() / 2.0).toInt()
        val base = 2 * x + 2
        val correction = when(x){
            1 -> 1
            5 -> -1
            else -> 0
        }
        return base + correction
    }
    fun _updateStats(){

        ca = 10 + (skillMods["des"]?:0) + equipedItems.getDefense()
        ba = level + equipedItems.getDefense() + (skillMods[equipedItems.getDamageType()]?:0)
        jp = _calcJp()

    }
}