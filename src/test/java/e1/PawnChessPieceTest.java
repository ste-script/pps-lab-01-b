package e1;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PawnChessPieceTest extends ChessPieceTestImpl {

    @BeforeEach
    public void setUp() {
        this.piece = new PawnChessPiece();
    }

    @Override
    @Test
    public void testValidMove() {
        piece.setPosition(0, 0);
        assertFalse(piece.isValidMove(2, 1));
    }

}
