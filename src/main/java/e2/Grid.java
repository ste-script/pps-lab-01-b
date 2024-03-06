package e2;

public interface Grid {

    Cell getCell(Pair<Integer, Integer> position);

    void randomizeGrid();

    int getNumberOfAdiacentMines(Pair<Integer, Integer> position);

}
