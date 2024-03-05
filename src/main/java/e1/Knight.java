package e1;

public class Knight extends AbstractChessPiece {

    @Override
    public boolean isValidMove(int row, int col) {
        int x = row - this.position.getX();
        int y = col - this.position.getY();
        if (x != 0 && y != 0 && Math.abs(x) + Math.abs(y) == 3) {
            return true;
        }
        return false;
    }

}
