package e1;

public interface ChessPieceFactory {

    ChessPiece createPawn();

    ChessPiece createKnight();

    ChessPiece createRandomPositionPawn(int size);

    ChessPiece createRandomPositionKnightNotOnPawn(int size, Pair<Integer, Integer> pawnPosition);

}
