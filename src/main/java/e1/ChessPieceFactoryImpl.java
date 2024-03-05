package e1;

import java.util.Random;

public class ChessPieceFactoryImpl implements ChessPieceFactory {

    private final Random random;

    public ChessPieceFactoryImpl() {
        this.random = new Random();
    }

    @Override
    public ChessPiece createRandomPositionPawn(int size) {
        var pawn = new Pawn();
        var randomPawnPosition = new Pair<>(random.nextInt(size), random.nextInt(size));
        pawn.setPosition(randomPawnPosition.getX(), randomPawnPosition.getY());
        return pawn;
    }

    @Override
    public ChessPiece createRandomPositionKnightNotOnPawn(int size, Pair<Integer, Integer> pawnPosition) {
        var knight = new Knight();
        var randomKnightPosition = new Pair<>(random.nextInt(size), random.nextInt(size));
        while (randomKnightPosition.equals(pawnPosition)) {
            randomKnightPosition = new Pair<>(random.nextInt(size), random.nextInt(size));
        }
        knight.setPosition(randomKnightPosition.getX(), randomKnightPosition.getY());
        return knight;
    }

    @Override
    public ChessPiece createCustomPositionPawn(int x, int y) {
        var pawn = new Pawn();
        pawn.setPosition(x, y);
        return pawn;
    }

    @Override
    public ChessPiece createCustomPositionKnight(int x, int y) {
        var knight = new Knight();
        knight.setPosition(x, y);
        return knight;
    }

}
