package e1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.function.BiPredicate;

public class LogicTest {

  private int boardSize = 5;

  @Test
  public void testKnightInitialPosition() {
    Logics logics = new LogicsImpl(boardSize);
    assertTrue(testBiPredicateOverAllPositions(logics::hasKnight));
  }

  @Test
  public void testPawnInitialPosition() {
    Logics logics = new LogicsImpl(boardSize);
    assertTrue(testBiPredicateOverAllPositions(logics::hasPawn));
  }

  private boolean testBiPredicateOverAllPositions(BiPredicate<Integer, Integer> p) {
    for (int i = 0; i < boardSize; i++) {
      for (int j = 0; j < boardSize; j++) {
        if (p.test(i, j)) {
          return true;
        }
      }
    }
    return false;
  }
}
