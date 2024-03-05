package e1;

public class ChessPieceImpl implements ChessPiece {

    protected Pair<Integer, Integer> position;
    private MoveStrategy moveStrategy;

    public ChessPieceImpl(MoveStrategy moveStrategy) {
        this.position = new Pair<>(0, 0);
        this.moveStrategy = moveStrategy;
    }

    @Override
    public Pair<Integer, Integer> getPosition() {
        return this.position;
    }

    @Override
    public boolean isValidMove(int row, int col) {
        return this.moveStrategy.isValidMove(row, col, this.position);
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
