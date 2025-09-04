package models.character

import models.character.item.EquipedSlots
import models.character.item.Item
import models.character.race.Race
import models.character.spec.iSpec
import kotlin.math.floor

class Character {
    var name: String = ""

    var race: Race? = null
    var characterClass: iSpec? = null

    var level: Int = 1
    var xp: Int = 0

    var skills = mutableMapOf<String, Int>()

    var gold: Int = 0

    var equipedItems: EquipedSlots = EquipedSlots(null,null,null)

    var inventory: MutableList<Item> = emptyList<Item>().toMutableList()

    fun checkLevelUpStatus(): Boolean {
        var xpNeeded = 0
        when(this.level){
            1 -> xpNeeded = 2000
            2 -> xpNeeded = 4000
            3 -> xpNeeded = 7000
            4 -> xpNeeded = 10000
            5 -> xpNeeded = 20000
            6 -> xpNeeded = 30000
            7 -> xpNeeded = 40000
            8 -> xpNeeded = 50000
            9 -> xpNeeded = 100000
            10 -> xpNeeded = 999999999
        }
        return this.xp>=xpNeeded
    }
    fun getSkillMod(skill: String): Int {
        if(!this.skills.containsKey(skill)||this.skills[skill]==null){
            error("skill $skill does not exist")
        }
        return when{
            this.skills[skill]!! < 1 -> error("skill $skill cannot be less than 1")
            this.skills[skill] in 9..12 -> 0
            this.skills[skill]!! > 12 -> floor((this.skills[skill]!!.toDouble()-10)/2).toInt()
            this.skills[skill]!! < 9 -> floor((this.skills[skill]!!.toDouble()-10)/2).toInt()
            else -> 0
        }
    }
}