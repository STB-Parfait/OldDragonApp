package models.character.race

import models.character.hability.RacialHability

data class Race(
    val name: String,
    val description: String,
    val infravision: Int?,
    val movement: Int,
    val alignmentColumn: Int, //[0] lawfull [1] neutral [2] caotic
    val habilities: List<RacialHability>
)
