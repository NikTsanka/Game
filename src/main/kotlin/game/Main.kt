package game

import java.io.File
import java.io.FileNotFoundException
import java.util.*

fun main() {

    val enemiesFile = File("src/main/kotlin/game/enemies")
    try {
        val scanner = Scanner(enemiesFile)
        val base = EnemyBaseImpl(scanner)
        base.enter(Character("Luke Skywalker", 785, DarthVader.SITH_LORD))
    } catch (ex: FileNotFoundException) {
        println("Enemies file could not be found")
    } catch (ex: CharacterDeathException) {
        println(ex.message)
    }
}
