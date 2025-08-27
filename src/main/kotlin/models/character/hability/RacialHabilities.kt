package models.character.hability

object RacialHabilities {
    val pubBrothers = RacialHability(
        "Irmãos de bar",
        "Anões podem ser bem estoicos, mas sabem como descansar depois de um longo dia de trabalho." +
                "<+1 em carisma>",
        "cha",
        1
    )
    val hardShell = RacialHability(
        "Casca-grossa",
        "Minas, forjas, pedreiras, seja o que for, não há trabalho pesado de mais para um anão." +
                "<+1 em constituição>",
        "con",
        1
    )
    val rowdy = RacialHability(
        "Rebeldes",
        "Humanos parecem nunca estarem satisfeitos com nada, e eles não tem medo de fazer algo sobre." +
                "<+1 em força>",
        "str",
        1
    )
    val ingenious = RacialHability(
        "Engenhosos",
        "Apesar de terem vidas curtas, os humanos aprendem e compartilham conhecimento como nenhuma outra raça." +
                "<+1 em inteligência>",
        "int",
        1
    )
    val cunning = RacialHability(
        "Astutos",
        "Elfos se movem com uma velocidade impressionante, até para os seres mais etéreos." +
                "<+1 em destreza>",
        "dex",
        1
    )
    val longLives = RacialHability(
        "Vidas longas",
        "Elfos vivem por mais tempo do que todas as outras raças, acumulando muitas experiências ao longo de suas vidas." +
                "<+1 em sabedoria>",
        "wis",
        1
    )
}