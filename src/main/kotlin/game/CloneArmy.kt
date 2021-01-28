package game

class CloneArmy(
    private val attackStrength: Int
) : Enemy {

    override fun type(): String = EMPIRE_SOLDIER

    override fun attackStrength(): Int = attackStrength

    companion object {
        const val EMPIRE_SOLDIER = "CLONE_SOLDIERS"
    }
}