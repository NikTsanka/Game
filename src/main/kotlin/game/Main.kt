package game

import game.character.Character
import game.character.CharacterDeathException
import game.enemy.EnemyBaseImpl
import game.enemy.SithMaster
import java.io.File
import java.io.FileNotFoundException
import java.util.*

fun main() {

    val enemiesFile = File("src/main/kotlin/game/enemies")

    try {
        val scanner = Scanner(enemiesFile)
        val base = EnemyBaseImpl(scanner)
        base.enter(Character("Luke Skywalker", 1500, listOf(DarthVader.SITH_LORD, SithMaster.SITH_MASTER)))
    } catch (ex: FileNotFoundException) {
        println("Enemies file could not be found")
    } catch (ex: CharacterDeathException) {
        println(ex.message)
    }
}
