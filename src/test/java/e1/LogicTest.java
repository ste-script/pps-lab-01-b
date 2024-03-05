package e1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.function.BiPredicate;

public class LogicTest {

  private int boardSize = 5;

  @Test
  public void testKnightInitialPosition() {
    Logics logics = new LogicsImpl(boardSize);
    Pair<Integer, Integer> knight = findPieceInBoard(logics, logics::hasKnight);
    assertTrue(logics.hasKnight(knight.getX(), knight.getY()));
  }

  @Test
  public void testPawnInitialPosition() {
    Logics logics = new LogicsImpl(boardSize);
    Pair<Integer, Integer> pawn = findPieceInBoard(logics, logics::hasPawn);
    assertTrue(logics.hasPawn(pawn.getX(), pawn.getY()));
  }

  @Test
  public void testHitOutOfBounds() {
    Logics logics = new LogicsImpl(boardSize);
    assertThrows(IndexOutOfBoundsException.class, () -> logics.hit(-1, 0));
  }

  @Test
  public void testWinWithFixedPositions(){
    Pair<Integer, Integer> pawn = new Pair<>(0, 0);
    Pair<Integer, Integer> knight = new Pair<>(2, 1);
    Logics logics = new LogicsImpl(boardSize, pawn, knight);
    assertTrue(logics.hit(pawn.getX(), pawn.getY()));
  }

  private Pair<Integer, Integer> findPieceInBoard(Logics logics, BiPredicate<Integer, Integer> p) {
    for (int i = 0; i < boardSize; i++) {
      for (int j = 0; j < boardSize; j++) {
        if (p.test(i, j)) {
          return new Pair<>(i, j);
        }
      }
    }
    throw new IllegalStateException("Piece not found");
  }

}
