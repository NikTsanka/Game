package game

import java.util.*
import kotlin.collections.ArrayList

class EnemyBaseImpl(scanner: Scanner) : EnemyBase {

    private val enemies = ArrayList<Enemy>()

    init {
        while (scanner.hasNext()) {
            when (scanner.next()) {
                CloneArmy.EMPIRE_SOLDIER -> {
                    add(CloneArmy(scanner.nextInt()))
                }
                DarthVader.SITH_LORD -> {
                    add(DarthVader(scanner.nextInt()))
                }
                SithMaster.SITH_MASTER -> {
                    add(SithMaster(scanner.nextInt()))
                }
            }
        }
    }

    override fun add(enemy: Enemy) {
        enemies.add(enemy)
    }

    override fun enter(character: Character) {
        character.reportEnteringEnemyBase()
        for (enemy in enemies) {
            character.fight(enemy)
        }
    }
}