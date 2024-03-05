package e1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

abstract public class ChessPieceTestImpl implements ChessPieceTest {

    protected ChessPiece piece;

    @Override
    @Test
    public void testInitialPosition() {
        assertEquals(new Pair<Integer, Integer>(0, 0), piece.getPosition());
    }

    @Override
    @Test
    public void testInvalidMove() {
        piece.setPosition(0, 0);
        assertFalse(piece.isValidMove(2, 2));
    }

    @Override
    @Test
    public void testSetPosition() {
        piece.setPosition(2, 1);
        assertEquals(new Pair<Integer, Integer>(2, 1), piece.getPosition());
    }

    @Override
    @Test
    public void testIsAtPosition() {
        piece.setPosition(2, 1);
        assertTrue(piece.isAtPosition(2, 1));
    }

    @Override
    @Test
    public void testIsNotAtPosition() {
        piece.setPosition(2, 1);
        assertFalse(piece.isAtPosition(0, 0));
    }

}
