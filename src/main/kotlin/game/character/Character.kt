package game.character

import game.interfaces.Enemy
import game.interfaces.FlyingEnemy

class Character(
    private val name: String,
    private var health: Int,
    var weaknessEnemyType: List<String>
) {

    fun fight(enemy: Enemy) {
        when {
            weaknessEnemyType.contains(enemy.type()) -> {
                health -= enemy.attackStrength() * 2
                println("$name is fighting with ${enemy.type()} with strength ${enemy.attackStrength()}")
                println("$name has lost 2X health because of strong enemy ")
            }
            else -> {
                health -= enemy.attackStrength()
                println("$name is fighting with ${enemy.type()} with strength ${enemy.attackStrength()}")
            }
        }

        if (enemy is FlyingEnemy){
            println("$name has lost +${enemy.flyingAttackBonus()} health in flying attack")
            health -= enemy.flyingAttackBonus()
        }

        if (health <= 0) {
            throw CharacterDeathException()
        } else {
            println("$name is alive with $health health")
            if (weaknessEnemyType.contains(enemy.type())){
                health += 150
                println("$name has got bonus 150 health for winning fight with ${enemy.type()}. Current health is $health")
            }
        }
    }

    fun reportEnteringEnemyBase() {
        println()
        println("$name enters enemy base with health $health")
    }
}