package e1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ChessPieceFactoryTest {

    private final ChessPieceFactory factory = new ChessPieceFactoryImpl();

    @Test
    public void testCreatePawn() {
        assertNotNull(factory.createPawn());
    }

    @Test
    public void testCreateKnight() {
        assertNotNull(factory.createKnight());
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
