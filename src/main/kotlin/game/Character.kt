package game

class Character(
    private val name: String,
    private var health: Int,
    private var weaknessEnemyType: String
) {

    fun fight(enemy: Enemy) {
        when (weaknessEnemyType) {
            enemy.type() -> {
                health -= enemy.attackStrength() * 2
                println("$name is fighting with ''${enemy.type()}''")
            }
            else -> {
                health -= enemy.attackStrength()
                println("$name is fighting with ''${enemy.type()}''")
            }
        }
        if (health <= 0) {
            throw CharacterDeathException()
        } else println("$name is alive with $health health")
    }

    fun reportEnteringEnemyBase() {
        println()
        println("$name enters enemy base with health $health")
    }
}