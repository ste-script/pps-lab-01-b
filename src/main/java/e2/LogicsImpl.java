package e2;

public class LogicsImpl implements Logics {

    private final Grid grid;
    private final int size;
    private final GameLogicDifficulty difficulty;

    public LogicsImpl(int size, GameLogicDifficulty difficulty) {
        this.size = size;
        this.difficulty = difficulty;
        this.grid = new GridImpl(size, getNumberOfMines());
        this.grid.randomizeGrid();
    }

    private int getNumberOfMines() {
        return ((size * size) / 2) * difficulty.getValue() / 100;
    }

    @Override
    public Grid getGrid() {
        return this.grid;
    }

    @Override
    public boolean isWinCondition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isWinCondition'");
    }

    @Override
    public boolean isLoseCondition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isLoseCondition'");
    }

    @Override
    public void triggerCell(Pair<Integer, Integer> position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'triggerCell'");
    }

}
