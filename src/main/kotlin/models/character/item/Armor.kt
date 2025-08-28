package models.character.item

class Armor(
    name: String,
    price: Int,
    val defense: Int
): Item(name, price)