package e1;

public class LogicsImpl implements Logics {

	private final ChessPiece pawn;
	private final ChessPiece knight;
	private final ChessPieceFactory factory = new ChessPieceFactoryImpl();
	private final int size;

	public LogicsImpl(int size) {
		this.size = size;
		this.pawn = factory.createRandomPositionPawn(size);
		this.knight = factory.createRandomPositionKnightNotOnPawn(size, this.pawn.getPosition());
	}

	public LogicsImpl(int size, Pair<Integer, Integer> pawn, Pair<Integer, Integer> knight) {
		this.size = size;
		this.pawn = factory.createCustomPositionPawn(pawn.getX(), pawn.getY());
		this.knight = factory.createCustomPositionKnight(knight.getX(), knight.getY());
	}

	@Override
	public boolean hit(int row, int col) {
		checkIsOutOfBound(row, col);
		if (this.knight.isValidMove(row, col)) {
			this.knight.setPosition(row, col);
			return this.pawn.isAtPosition(row, col);
		}
		return false;
	}

	private void checkIsOutOfBound(int row, int col) {
		if (row < 0 || col < 0 || row >= this.size || col >= this.size) {
			throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knight.isAtPosition(row, col);
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.isAtPosition(row, col);
	}
}
