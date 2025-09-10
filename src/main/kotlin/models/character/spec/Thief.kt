package models.character.spec

import models.character.item.EquipedSlots

class Thief(
    level: Int,
    skillMods: Map<String,Int>,
    equipedItems: EquipedSlots,
    dice: Int
): iSpec(level, skillMods, equipedItems, dice) {
    init{
        maxHp = 6
        hp = maxHp
        this._updateLesserStats(level, skillMods, equipedItems)
    }
}