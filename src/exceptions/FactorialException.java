package exceptions;

public class FactorialException extends IllegalArgumentException{
    private int number;

    public FactorialException(String s, int number) {
        super(s);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
