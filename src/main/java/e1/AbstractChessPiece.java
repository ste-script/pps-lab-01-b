package e1;

abstract public class AbstractChessPiece implements ChessPiece {

    protected Pair<Integer, Integer> position;

    public AbstractChessPiece() {
        this.position = new Pair<>(0, 0);
    }

    @Override
    public Pair<Integer, Integer> getPosition() {
        return this.position;
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
