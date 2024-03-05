package e1;

public class Knight implements ChessPiece {

    private ChessPiece knight;

    public Knight() {
        this.knight = new ChessPieceImpl(new KnightMoveStrategy());
    }

    public Pair<Integer, Integer> getPosition() {
        return knight.getPosition();
    }

    public boolean isValidMove(int row, int col) {
        return knight.isValidMove(row, col);
    }

    public void setPosition(int row, int col) {
        knight.setPosition(row, col);
    }

    public boolean isAtPosition(int row, int col) {
        return knight.isAtPosition(row, col);
    }

}
