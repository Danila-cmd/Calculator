package Calculator;

import java.text.DecimalFormat;

public class ArabicValue extends Validate {

    @Override
    public boolean check(int a, int b) {
        return super.check(a, b);
    }

    public static int arabicValueFirst(String[] array) {
        String firstValue = array[0];

        switch (firstValue) {
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
        }
        return -1;
    }

    public static int arabicValueSecond(String[] array) {

        String secondValue = array[2];

        switch (secondValue) {
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
        }
        return -1;
    }

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void minus(int a, int b) {
        System.out.println(a - b);
    }

    public void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    public void division(int a, int b) {

        double aDouble = Double.parseDouble(String.valueOf(a));
        double bDouble = Double.parseDouble(String.valueOf(b));

        double del = aDouble / bDouble;

        DecimalFormat df = new DecimalFormat("#.#");

        System.out.println(df.format(del));
    }

}
