package exceptions.hw;

public class ArrayDataException extends IllegalArgumentException{
    private int lineNumber;
    private int cellNumber;

    public ArrayDataException(String s,int lineNumber, int cellNumber) {
        super(s);
        this.lineNumber = lineNumber;
        this.cellNumber = cellNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getCellNumber() {
        return cellNumber;
    }
}
