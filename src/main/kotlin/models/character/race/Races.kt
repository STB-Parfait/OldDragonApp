package models.character.race

import models.character.hability.RacialHabilities

object Races {
    val dwarf = Race(
        name = "Anão",
        description = "Habilidosos artesãos, esses moradores alpinos sua resistência é amplamente conhecida.",
        infravision = 18,
        movement = 6,
        alignmentColumn = 0,
        habilities = listOf(
            RacialHabilities.hardShell,
            RacialHabilities.pubBrothers
        ),
    )
    val human = Race(
        name = "Humano",
        description = "Humanos são os mais ferozes mercenários, conhecidos por sua habilidade de improvização.",
        infravision = null,
        movement = 9,
        alignmentColumn = 2,
        habilities = listOf(
            RacialHabilities.rowdy,
            RacialHabilities.ingenious
        )
    )
    val elf = Race(
        name = "Elfo",
        description = "Elfos são altos como as árvores e graciosos como as flores.",
        infravision = 18,
        movement = 9,
        alignmentColumn = 1,
        habilities = listOf(
            RacialHabilities.cunning,
            RacialHabilities.longLives
        )
    )
}