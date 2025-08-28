package models.character.spec

import models.character.item.EquipedSlots
import models.character.item.Item

interface iSpec {
    val level: Int
    val skillMods: Map<String,Int>
    val equipedItems: EquipedSlots
}