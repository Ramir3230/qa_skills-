package paket;

import java.util.Scanner;

public class Domashka2 {
    public static void main(String[] args) {
        boolean miniProgram = true;
        while (miniProgram) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите вариант:\n"
                                + "1.Вычисление среднего числа\n"
                                + "2.Дублирование текста с нумерацией\n"
                                + "3.Узнать какие числа деляться на 5 без остатка в выбранном интервале");

            System.out.println("Ваш выбор: ");
            double number1 = scanner.nextDouble();
            if (number1 == 1) {
                String resultFirst = method1();
                System.out.println(resultFirst);
            } else if (number1 == 2) {
                String resultSecond = method2();
                System.out.println("Ваше дублирование:");
                System.out.println(resultSecond);
            }else if(number1 == 3){
                  String resultThird = method3();
                  if(resultThird != ""){
                      System.out.println("Полученный результат\n" + resultThird);
                  }else{
                      System.out.println("Неправильно задан интервал");
                  }


            } else {
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

    public static String method1 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Определяем парное ли число");
        System.out.println("Ввeдите пожалуйста ваше число: ");
        double number1 = scanner.nextDouble();
        String number2;
        if (number1 % 2 == 0){
            number2 = ("Ваше число " + number1 + " Парное");
        }else{
            number2 = ("Ваше число " + number1 + " Непарное");
        }
        return number2;
    }

    public static String method2 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Дублирование текста с нумерацией");
        System.out.println("Ввeдите пожалуйста ваш текст: ");
        String number1 = scanner.next();
        System.out.println("Ввeдите пожалуйста желаемое количество дубликотов: ");
        double number2 = scanner.nextDouble();
        String result = "";
        for (int i = 1; i <= number2; i++) {
            String number3 = number1 + " " + i;
            result += number3 +"\n";
        }
        return result;
    }

    public static String method3 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Узнать числа деленные на 5 без остатка");
        System.out.println("Ввeдите пожалуйста начало интервала (от):");
        int number1 = scanner.nextInt();
        System.out.println("Ввeдите пожалуйста конец интервала (до):");
        int number2 = scanner.nextInt();
        String result = "";
        for (int i = number1; i <= number2; i++){
            if((number1 <= number2) && (number2 >= 5)){
                if (i % 5 == 0) {

                    result += i + "\n";

                }

            }else {
                result = "Неправильно задан интервал";
            }
        }
        return result;

    }
}
