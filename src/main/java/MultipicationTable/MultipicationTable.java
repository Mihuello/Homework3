package MultipicationTable;

/*
Таблица умножения
 */

public class MultipicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.print("\n");

            for (int j = 1; j <= 10; j++) {

                System.out.print(i * j + "\t");
            }
        }
    }
}