package models.character.especialization

interface iEspecialization {
    val hitDice: Int



    fun basicAttack()
    fun effectAttack()
    fun minorAttack()
    fun greaterAttack()
}