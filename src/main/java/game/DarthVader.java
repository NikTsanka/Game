package game;

import game.interfaces.Enemy;
import org.jetbrains.annotations.NotNull;

public class DarthVader implements Enemy {

    public static final String SITH_LORD = "DARTH_VADER";
    private final int attackStrength;

    public DarthVader(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    @NotNull
    @Override
    public String type() {
        return SITH_LORD;
    }

    @Override
    public int attackStrength() {
        return this.attackStrength;
    }
}
