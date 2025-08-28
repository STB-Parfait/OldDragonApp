package models.character.item

class Weapon(
    name: String,
    price: Int,
    val type: String,
    val damage: Int,
): Item(name, price)