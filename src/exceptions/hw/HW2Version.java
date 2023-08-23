package exceptions.hw;

public class HW2Version {
    public static void main(String[] args) {

        try {
            System.out.println(arraySum(new String[][]{
                    {"1", "1", "1", "2"},
                    {"2", "2", "2", "1"},
                    {"2", "2", "2", "1"},
                    {"2", "2", "1", "1"},
            }));
        } catch (ArrayDataException e) {
            e.printStackTrace();
            System.out.printf("Ошибка в строке №%d  в ячейке №%d ", e.getLineNumber(), e.getCellNumber());
            System.out.println();

        } catch (ArraySizeException e) {
            e.printStackTrace();
        }
        System.out.println("the end");
    }

    public static int arraySum(String[][] arr) throws ArrayDataException {
        if (arr.length != 4) throw new ArraySizeException("Неправильный размер массива");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    throw new ArraySizeException("Неправильный размер массива");
                }

            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Неправильный элемент", i, j);
                }
            }
        }
        return sum;
    }
}
