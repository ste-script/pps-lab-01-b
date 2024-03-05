package e1;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
