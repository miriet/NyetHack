fun main(args: Array<String>) {
    val name="Midreal"
    var healthPoints=25
    val isBlessed = true
    val isImmortal = false
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    healthPoints = 8
    val healthStatus2 = formatHealthStatus2(healthPoints, isBlessed)

    println(name + healthStatus)
    println("status2::")
    println("$name $healthStatus2")

    //플레이어의 상태 출력
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    castFireball(5)
    castFireball()
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println(
        "(Aura: $auraColor) " +
                "(Blessed: ${if (isBlessed) "YES" else "NO"})"
    )
    println("$name $healthStatus")
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
    val healthStatus = if (healthPoints == 100) {
        " has BEST condition!"
    } else if (healthPoints >= 90) {
        " has GOOD condition!"
    } else if (healthPoints in 26..75) {
        if (isBlessed) {
            " is blessed and has BEST condition!"
        } else {
            " has normal condition!"
        }
    } else if (healthPoints >= 25) {
        " has bad condition!"
    } else {
        " is ready to die!!"
    }
    return healthStatus
}

private fun formatHealthStatus2(healthPoints: Int, isBlessed: Boolean): String{
    val healthStatus2 = when (healthPoints) {
        100 -> " has BEST condition!"
        in 80..99 -> " has GOOD condition!"
        in 26..79 -> if (isBlessed) {
            " is blessed and has BEST condition!"
        } else {
            " has normal condition!"
        }
        in 10..25 -> " has bad condition!"
        else -> " is ready to die!!"
    }
    return healthStatus2
}

private fun castFireball(numFireballs:Int=2){
    println("$numFireballs 덩어리의 파이어볼이 나타난다.")
}