package game.enemy

import game.interfaces.Enemy
import game.interfaces.FlyingEnemy

class HelicopterNinja(
    private val attackStrength: Int,
    private val flyingAttackBonus: Int,
) : Enemy, FlyingEnemy {

    override fun type(): String = HELICOPTER

    override fun attackStrength(): Int = attackStrength

    override fun flyingAttackBonus(): Int = flyingAttackBonus

    companion object {
        const val HELICOPTER = "HELICOPTER_NINJA"
    }

}