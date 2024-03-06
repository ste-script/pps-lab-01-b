package e2;

public class CellImpl implements Cell {

    private final CellType type;
    private final String text;

    public CellImpl(CellType mine, String text) {
        this.type = mine;
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public CellType getType() {
        return type;
    }

    @Override
    public boolean isMine() {
        return type == CellType.MINE;
    }

}
