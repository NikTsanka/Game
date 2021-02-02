package game.interfaces

import game.character.Character

interface EnemyBase {

    fun filterWithWeakness(character: Character): List<Enemy>

    fun add(enemy: Enemy)

    fun remove(enemy: Enemy)

    fun enter(character: Character)
}