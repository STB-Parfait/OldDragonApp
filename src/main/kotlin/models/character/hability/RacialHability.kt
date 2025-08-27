package models.character.hability

class RacialHability(
    title: String,
    description: String,
    val skillMod: String,
    val modSum: Int
): Hability(title,description)
