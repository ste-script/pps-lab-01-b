package e1;

public class Pawn implements ChessPiece {

    private ChessPiece pawn;

    public Pawn() {
        this.pawn = new ChessPieceImpl(new PawnMoveStrategy());
    }

    public Pair<Integer, Integer> getPosition() {
        return pawn.getPosition();
    }

    public boolean isValidMove(int row, int col) {
        return pawn.isValidMove(row, col);
    }

    public void setPosition(int row, int col) {
        pawn.setPosition(row, col);
    }

    public boolean isAtPosition(int row, int col) {
        return pawn.isAtPosition(row, col);
    }

}
