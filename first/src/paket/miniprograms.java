package paket;

import java.util.Scanner;

public class miniprograms {

    public static void main(String[] args) {
        boolean miniProgram = true;
        while (miniProgram) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите вариант: 1.Вычисление среднего числа.  2.Вычисление остатка деления 3.Неявное преобразование. 4.Явное преобразование");
            System.out.println("Выберите вариант: ");
            double number1 = scanner.nextDouble();
            if (number1 == 1) {
                double resultFirst = first();
                System.out.println("Cреднее значение равняется " + resultFirst);
            } else if (number1 == 2) {
                double resultSecond = second();
                System.out.println("Остаток от деления равняется: " + resultSecond);
            } else if(number1 == 3){
                double resultThird = third();
                System.out.println("Ваше число " + resultThird + " Было преобразовано из типа Byte по такому пути Byte-short-int-float-Double");
            }else if(number1 == 4){
                double resultFourth = fourth();
                System.out.println("Ваше число " + resultFourth + " Было преобразовано из типа Double  по такому пути Double-long-int-short-Byte");
            }else {

                System.out.println("Такого варинта нет");
            }

            System.out.println("Желаете начать еще раз ?(Варианты ответа да или нет)");
            String answer = scanner.next();
            if(!answer.equalsIgnoreCase("да")) {
                miniProgram = false;
            }else if(!answer.equalsIgnoreCase("нет")){
                miniProgram = true;

            }
            System.out.println("Работа програмы завершена");
        }


    }



    public static double first() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Вычисление средьнего числа");

        System.out.println("Ввeди первое число: ");
        double number1 = scanner.nextDouble();

        System.out.println("Введи второе число: ");
        double number2 = scanner.nextDouble();

        System.out.println("Введи третье число: ");
        double number3 = scanner.nextDouble();

        double result1 = (number1 + number2 + number3) / 3;

        return result1;
    }

    public static byte second () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("2. Вычисление остатка после деления");
        System.out.println("Ввeди первое число: ");
        double number1 = scanner.nextDouble();

        System.out.println("Введи второе число: ");
        double number2 = scanner.nextDouble();

        double result2 = (byte) (number1%number2);

        return (byte) result2;

    }

    public static double third () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввeдите число от -127 до 127: ");
        byte number1 = scanner.nextByte();
        short number2 = number1;
        int number3 = number2;
        float number4 = number3;
        double number5 = number4;

        return number5;


    }

    public static byte fourth () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввeдите число от -127 до 127: ");
        double number1 = scanner.nextByte();
        long number2 = (long)number1;
        int number3 = (int)number2;
        short number4 = (short)number3;
        byte number5 = (byte)number4;

        return number5;


    }


}
