package e1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KnightTest {

    private ChessPiece knight;

    @BeforeEach
    public void setUp() {
        knight = new Knight();
    }

    @Test
    public void testInitialPosition() {
        assertEquals(new Pair<Integer, Integer>(0, 0), knight.getPosition());
    }

    @Test
    public void testValidMove() {
        knight.setPosition(0, 0);
        assertTrue(knight.isValidMove(2, 1));
    }

    @Test
    public void testInvalidMove() {
        knight.setPosition(0, 0);
        assertFalse(knight.isValidMove(2, 2));
    }

    @Test
    public void testSetPosition() {
        knight.setPosition(2, 1);
        assertEquals(new Pair<Integer, Integer>(2, 1), knight.getPosition());
    }

    @Test
    public void testIsAtPosition() {
        knight.setPosition(2, 1);
        assertTrue(knight.isAtPosition(2, 1));
    }

    @Test
    public void testIsNotAtPosition() {
        knight.setPosition(2, 1);
        assertFalse(knight.isAtPosition(0, 0));
    }

}
