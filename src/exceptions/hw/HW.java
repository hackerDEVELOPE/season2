package exceptions.hw;

public class HW {
    public static void main(String[] args) {

        System.out.println(arraySum(new String[][]{
                {"1", "1", "1", "2"},
                {"2", "2", "6", "1"},
                {"2", "2", "2", "1"},
                {"2", "2", "1", "1"},
        }));

        System.out.println("the end");
    }

    public static int arraySum(String[][] arr) {

        try {
            if (arr.length != 4) throw new ArraySizeException("Неправильный размер массива");
        } catch (ArraySizeException e) {
            e.printStackTrace();
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i].length != 4) {
                    throw new ArraySizeException("Неправильный размер массива");
                }
            } catch (ArraySizeException e) {
                e.printStackTrace();
                break;
            }

            for (int j = 0; j < arr[i].length; j++) {
                try {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException("Неправильный элемент", i, j);
                    }
                } catch (ArrayDataException e) {
                    e.printStackTrace();
                    System.out.printf("Ошибка в строке №%d  в ячейке №%d ", e.getLineNumber(), e.getCellNumber());
                    break;
                }
            }
        }
        return sum;
    }
}
