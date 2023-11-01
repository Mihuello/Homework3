package PrimeNumber;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime;
        for (int number = 2; number < 50; number++) {
            isPrime = true;
            // Проверям делится ли чисто без остатка
            for (int number2 = 2; number2 <= number / number2; number2++) {
                // Если число делится без остатка, значит оно не простое
                if ((number % number2) == 0) isPrime = false;
                if (isPrime)

                    System.out.println(number + " Простое число");
            }

        }

    }
}

