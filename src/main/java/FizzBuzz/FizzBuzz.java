package FizzBuzz;
/*
Знаменитый fizz buzz
 */

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + ":" + "\n");

            System.out.println("FizzBuzz");

            if (i % 3 == 0)
                System.out.print(i + ":" + "\n");

            System.out.println("fizz");

            if (i % 5 == 0)
                System.out.print(i + ":" + "\n");

            System.out.println("buzz");
        }
    }
}
