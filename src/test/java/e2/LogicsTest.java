package e2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LogicsTest {

    private Logics logics;
    private GameLogicDifficulty difficulty = GameLogicDifficulty.EASY;
    private int size = 8;

    @BeforeEach
    public void setUp() {
        this.logics = new LogicsImpl(size, difficulty);
    }

    @Test
    public void getGrid() {
        var grid = logics.getGrid();
        int sizeCounter = 0;
        for (var cell : grid) {
            sizeCounter++;
        }
        assertEquals(sizeCounter, size * size);
    }

}
