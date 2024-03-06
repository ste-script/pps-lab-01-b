package e2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CellTest {

    @Test
    public void createBombCell() {
        Cell cell = new CellImpl(CellType.MINE, "X");
        assertEquals(CellType.MINE, cell.getType());
    }
}
