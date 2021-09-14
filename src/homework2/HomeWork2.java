package homework2;


class MyArraySizeException extends Exception {

}

class MyArrayDataException extends Exception {


    public MyArrayDataException(String message) {
        super(message);
    }
}

public class HomeWork2 {

    private static String[][] initialArray;

    private static int arraySum(String[][] initialArray) throws MyArraySizeException, MyArrayDataException {

        if (initialArray.length != 4 || initialArray[0].length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum = sum + Integer.parseInt(initialArray[i][j]);
                } catch (NumberFormatException e) {
                    String message = "Error in element [" + i + "][" + j + "]!";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        initialArray = new String[4][4];

        initialArray[0][0] = "1";
        initialArray[0][1] = "2";
        initialArray[0][2] = "3";
        initialArray[0][3] = "4";
        initialArray[1][0] = "5";
        initialArray[1][1] = "6";
        initialArray[1][2] = "7";
        initialArray[1][3] = "8";
        initialArray[2][0] = "9";
        initialArray[2][1] = "1O";
        initialArray[2][2] = "11";
        initialArray[2][3] = "12";
        initialArray[3][0] = "13";
        initialArray[3][1] = "14";
        initialArray[3][2] = "15";
        initialArray[3][3] = "16";

        try {
            System.out.printf("ArraySum: %s", arraySum(initialArray));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.printf("EXCEPTION!: %s\n", e);
            e.printStackTrace();
        }






    }
}

