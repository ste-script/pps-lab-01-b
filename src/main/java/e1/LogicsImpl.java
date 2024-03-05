package e1;

import java.util.*;

public class LogicsImpl implements Logics {

	private final Pair<Integer, Integer> pawn;
	private ChessPiece knight;
	private final Random random = new Random();
	private final int size;

	public LogicsImpl(int size) {
		this.size = size;
		var randomKnightPosition = this.randomEmptyPosition();
		this.pawn = this.randomEmptyPosition();
		this.knight = new Knight();
		this.knight.setPosition(randomKnightPosition.getX(), randomKnightPosition.getY());
	}

	public LogicsImpl(int size, Pair<Integer, Integer> pawn, Pair<Integer, Integer> knight) {
		this.size = size;
		this.pawn = pawn;
		this.knight = new Knight();
		this.knight.setPosition(knight.getX(), knight.getY());
	}

	private final Pair<Integer, Integer> randomEmptyPosition() {
		Pair<Integer, Integer> pos = new Pair<>(this.random.nextInt(size), this.random.nextInt(size));
		// the recursive call below prevents clash with an existing pawn
		return this.pawn != null && this.pawn.equals(pos) ? randomEmptyPosition() : pos;
	}

	@Override
	public boolean hit(int row, int col) {
		if (row < 0 || col < 0 || row >= this.size || col >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		if (this.knight.isValidMove(row, col)) {
			this.knight.setPosition(row, col);
			return this.pawn.equals(this.knight.getPosition());
		}
		return false;
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knight.isAtPosition(row, col);
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.equals(new Pair<>(row, col));
	}
}
