package e1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KnightTest extends ChessPieceTestImpl {

    @BeforeEach
    public void setUp() {
        this.piece = new Knight();
    }

    @Override
    @Test
    public void testValidMove() {
        piece.setPosition(0, 0);
        assertTrue(piece.isValidMove(2, 1));
    }

}
