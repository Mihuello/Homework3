package PrimeNumber;
/*
Простые числа
 */
public class PrimeNumber {

    static void primeNumber(int number) {
        if (number == 1 ) System.out.println(number + " - Это число не составное и не простое ");
        if (number == 0) {
            System.out.println(number + " - Это число не является простым");
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i < number) {

                System.out.println(number + " - Это не простое число");
                break;
            } else if (number % i == 0) {

                System.out.println(number + " - Это простое число");
            }
        }
    }

    public static void main(String[] args) {

        primeNumber(3);
    }
}
























