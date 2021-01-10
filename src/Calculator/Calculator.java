package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    public static void start() {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))
        ) {

            String values = reader.readLine();
            String[] string = values.split(" ");

            int count = 0;

            for (int i = 0; i < string.length; i++) {
                count++;
            }

            if (count == 3) {

                RomanValues romanValues = new RomanValues();
                ArabicValue arabicValue = new ArabicValue();

                boolean checkRim = romanValues.check(RomanValues.romanValueFirst(string), RomanValues.romanValueSecond(string));
                boolean checkArabic = arabicValue.check(ArabicValue.arabicValueFirst(string), ArabicValue.arabicValueSecond(string));

                if (checkRim) {

                    int valueFirst = RomanValues.romanValueFirst(string);
                    int valueSecond = RomanValues.romanValueSecond(string);

                    if (string[1].equals("+")) {
                        String sum = RomanValues.sum(valueFirst, valueSecond);
                        System.out.println(sum);
                    } else if (string[1].equals("-")) {
                        String minus = RomanValues.minus(valueFirst, valueSecond);
                        System.out.println(minus);
                    } else if (string[1].equals("*")) {
                        String multiple = RomanValues.multiple(valueFirst, valueSecond);
                        System.out.println(multiple);
                    } else if (string[1].equals("/")) {
                        String delenie = RomanValues.delenie(valueFirst, valueSecond);
                        System.out.println(delenie);
                    } else {
                        throw new Exception("Ошибка! Введен неверный математический знак!");
                    }
                } else {
                    if (checkArabic) {

                        int a = Integer.parseInt(string[0]);
                        int b = Integer.parseInt(string[2]);

                        if (string[1].equals("+")) {
                            arabicValue.sum(a, b);
                        } else if (string[1].equals("-")) {
                            arabicValue.minus(a, b);
                        } else if (string[1].equals("*")) {
                            arabicValue.multiplication(a, b);
                        } else if (string[1].equals("/")) {
                            arabicValue.division(a, b);
                        } else {
                            throw new Exception("Ошибка! Введен неверный математический знак!");
                        }
                    } else {
                        throw new Exception("Ошибка! Математические действия должны производиться либо только с арабскими, либо только с римскими числами!");
                    }
                }
            } else {
                throw new Exception("Ошибка! Введите корректные данные!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}