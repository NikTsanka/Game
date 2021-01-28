package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaMain {

    public static void main(String[] args) {

        File enemiesFile = new File("src/main/kotlin/game/enemies");
        try {
            Scanner scanner = new Scanner(enemiesFile);
            EnemyBaseImpl base = new EnemyBaseImpl(scanner);
            base.enter(new Character("Skywalker", 784, DarthVader.SITH_LORD));
        } catch (FileNotFoundException e) {
            System.out.println("Enemies file could not be found");
        } catch (CharacterDeathException e) {
            System.out.println(e.getMessage());
        }
    }
}
