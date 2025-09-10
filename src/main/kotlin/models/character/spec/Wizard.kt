package models.character.spec

import models.character.item.EquipedSlots

class Wizard(
    level: Int,
    skillMods: Map<String,Int>,
    equipedItems: EquipedSlots,
    dice: Int
): iSpec(level, skillMods, equipedItems,dice) {
    init{
        maxHp = 4
        hp = maxHp
        this._updateLesserStats(level, skillMods, equipedItems)
    }
}