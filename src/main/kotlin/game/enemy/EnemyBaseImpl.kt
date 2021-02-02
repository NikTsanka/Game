package game.enemy

import game.DarthVader
import game.character.Character
import game.interfaces.Enemy
import game.interfaces.EnemyBase
import java.util.*
import kotlin.collections.ArrayList

class EnemyBaseImpl(val scanner: Scanner) : EnemyBase {

    private val enemies = ArrayList<Enemy>()

    init {
        while (scanner.hasNext()) {

            when (scanner.next()) {
                CloneArmy.EMPIRE_SOLDIER -> {
                    add(CloneArmy(scanner.nextInt()))
                }
                HelicopterNinja.HELICOPTER -> {
                    add(HelicopterNinja(scanner.nextInt(),scanner.nextInt()))
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

    override fun filterWithWeakness(character: Character): List<Enemy> {
        val enemyList = ArrayList<Enemy>()
        for (enemy in enemies){
            if (character.weaknessEnemyType.contains(enemy.type())){
                enemyList.add(enemy)
            }
        }
        return enemyList
    }

    override fun add(enemy: Enemy) {
        enemies.add(enemy)
    }

    override fun remove(enemy: Enemy) {
        enemies.remove(enemy)
    }

    override fun enter(character: Character) {
        character.reportEnteringEnemyBase()
        val weaknessEnemy = filterWithWeakness(character)
        enemies.sortBy { weaknessEnemy.contains(it) }
        for (enemy in enemies) {
            character.fight(enemy)
        }
    }
}