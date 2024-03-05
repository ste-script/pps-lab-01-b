package e1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ChessPieceFactoryTest {

    private final ChessPieceFactory factory = new ChessPieceFactoryImpl();

    @Test
    public void testCreatePawn() {
        assertTrue(factory.createCustomPositionPawn(0, 0).isAtPosition(0, 0));
    }

    @Test
    public void testCreateKnight() {
        assertTrue(factory.createCustomPositionKnight(0, 0).isAtPosition(0, 0));
    }

    @Test
    public void testCreateRandomPositionPawn() {
        assertNotNull(factory.createRandomPositionPawn(8));
    }

    @Test
    public void testCreateRandomPositionKnightNotOnPawn() {
        assertFalse(factory.createRandomPositionKnightNotOnPawn(8, new Pair<>(0, 0)).isAtPosition(0, 0));
    }

}
