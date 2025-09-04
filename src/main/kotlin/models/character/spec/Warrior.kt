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
        maxHp = 10
    }

    fun _updateLesserStats(level: Int, skillMods: Map<String, Int>, equipedItems: EquipedSlots) {
        this._updateCa(equipedItems)
        this._updateBa(equipedItems,skillMods)
        this._updateJp(level)
    }
    fun _updateMaxHp(){
        maxHp += Dice.roll(10)
    }
    fun _updateCa(equipedItems: EquipedSlots){
        this.ca = 10 + (skillMods["des"]?:0) + equipedItems.getDefense()
    }
    fun _updateBa(equipedItems: EquipedSlots,skillMods: Map<String,Int>){
        this.ba = level + equipedItems.getDefense() + (skillMods[equipedItems.getDamageType()]?:0)
    }
    fun _updateJp(level: Int){
        val x = ceil(level.toDouble() / 2.0).toInt()
        val base = 2 * x + 2
        val correction = when(x){
            1 -> 1
            5 -> -1
            else -> 0
        }
        this.jp = base + correction
    }
}