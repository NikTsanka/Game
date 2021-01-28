package game

class SithMaster(
    private val attackStrength: Int
) : Enemy {

    override fun type(): String = SITH_MASTER

    override fun attackStrength(): Int = attackStrength

    companion object {
        const val SITH_MASTER = "DARTH_SIDIOUS"
    }
}