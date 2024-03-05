package e1;

import java.util.*;

public class LogicsImpl implements Logics {

	private final ChessPiece pawn;
	private final ChessPiece knight;
	private final Random random = new Random();
	private final int size;

	public LogicsImpl(int size) {
		this.size = size;

		this.pawn = new Pawn();
		var randomPawnPosition = this.randomEmptyPosition();
		this.pawn.setPosition(randomPawnPosition.getX(), randomPawnPosition.getY());

		var randomKnightPosition = this.randomEmptyPosition();
		this.knight = new Knight();
		this.knight.setPosition(randomKnightPosition.getX(), randomKnightPosition.getY());
	}

	public LogicsImpl(int size, Pair<Integer, Integer> pawn, Pair<Integer, Integer> knight) {
		this.size = size;

		this.pawn = new Pawn();
		this.pawn.setPosition(pawn.getX(), pawn.getY());

		this.knight = new Knight();
		this.knight.setPosition(knight.getX(), knight.getY());
	}

	private final Pair<Integer, Integer> randomEmptyPosition() {
		Pair<Integer, Integer> pos = new Pair<>(this.random.nextInt(size), this.random.nextInt(size));
		// the recursive call below prevents clash with an existing pawn
		return this.pawn != null && this.pawn.isAtPosition(pos.getX(), pos.getY()) ? randomEmptyPosition() : pos;
	}

	@Override
	public boolean hit(int row, int col) {
		if (row < 0 || col < 0 || row >= this.size || col >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		if (this.knight.isValidMove(row, col)) {
			this.knight.setPosition(row, col);
			return this.pawn.isAtPosition(row, col);
		}
		return false;
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
