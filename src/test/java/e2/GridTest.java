package e2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GridTest {

    private Grid grid;
    private int numberOfMines = 1;
    private int gridSize = 8;

    @BeforeEach
    public void setUp() {
        grid = new GridImpl(gridSize, numberOfMines);

    }

    @Test
    public void getCell() {
        var cell = grid.getCell(new Pair<>(0, 0));
        assertTrue(cell.isMine());
    }

    @Test
    public void searchMines() {
        int mineCounter = 0;
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                mineCounter += grid.getCell(new Pair<>(i, j)).isMine() ? 1 : 0;
            }
        }
        assertEquals(numberOfMines, mineCounter);
    }

}
