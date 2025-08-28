package models.character.item

data class EquipedSlots(
    var leftArm: Weapon?,
    var rightArm: Weapon?,
    var body: Armor?
){
    init {
        if(leftArm?.type=="bow"){
            rightArm = null
        } else if (rightArm?.type=="bow"){
            leftArm = null
        }
    }
    fun getDefense(): Int {
        var sum = 0
        if(leftArm?.type=="shield"){
            sum += leftArm?.damage?:0
        }
        if(rightArm?.type=="shield"){
            sum += rightArm?.damage?:0
        }
        sum += body?.defense?:0
        return sum
    }
    fun getDamageType(): String {
        if(leftArm?.type=="bow"){
            return "dex"
        } else if (rightArm?.type=="bow"){
            return "dex"
        } else {
            return "str"
        }
    }
    fun getDamage(): Int {
        var sum = 0
        sum += (leftArm?.damage?:0) + (rightArm?.damage?:0)
        return sum
    }
}
