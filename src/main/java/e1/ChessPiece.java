package e1;

public interface ChessPiece {

    Pair<Integer, Integer> getPosition();

    boolean isValidMove(int row, int col);

    void setPosition(int row, int col);

    boolean isAtPosition(int row, int col);

}
