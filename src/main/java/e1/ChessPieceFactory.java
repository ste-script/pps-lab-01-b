package e1;

public interface ChessPieceFactory {

    ChessPiece createCustomPositionPawn(int x, int y);

    ChessPiece createCustomPositionKnight(int x, int y);

    ChessPiece createRandomPositionPawn(int size);

    ChessPiece createRandomPositionKnightNotOnPawn(int size, Pair<Integer, Integer> pawnPosition);

}
