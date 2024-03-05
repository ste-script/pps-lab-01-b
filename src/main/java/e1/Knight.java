package e1;

public class Knight implements ChessPiece {

    private Pair<Integer, Integer> position;

    public Knight() {
        this.position = new Pair<>(0, 0);
    }

    @Override
    public Pair<Integer, Integer> getPosition() {
        return this.position;
    }

    @Override
    public boolean isValidMove(int row, int col) {
        int x = row - this.position.getX();
        int y = col - this.position.getY();
        if (x != 0 && y != 0 && Math.abs(x) + Math.abs(y) == 3) {
            return true;
        }
        return false;
    }

    @Override
    public void setPosition(int row, int col) {
        this.position = new Pair<>(row, col);
    }

    @Override
    public boolean isAtPosition(int row, int col) {
        return this.position.equals(new Pair<>(row, col));
    }

}
