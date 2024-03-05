package e1;

public class KnightMoveStrategy implements MoveStrategy {

    @Override
    public boolean isValidMove(int row, int col, Pair<Integer, Integer> position) {
        int x = row - position.getX();
        int y = col - position.getY();
        if (x != 0 && y != 0 && Math.abs(x) + Math.abs(y) == 3) {
            return true;
        }
        return false;
    }
}
