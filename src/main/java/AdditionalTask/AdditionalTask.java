package AdditionalTask;
/*
Запасы гречки
 */

public class AdditionalTask {
    public static void main(String[] args) {
        int storingOneKilogramPerMonthCosts = 100;
        int vasilyEatsKilogramsOfBuckwheatInAMonth = 6;
        int forHowLongDoesHeWantToEatBuckwheat = 10;
        int theFullCostOfStoringBuckwheat = 0;
        int totalNumberOfBuckwheatEaten = 0;

        for (; forHowLongDoesHeWantToEatBuckwheat > 0; forHowLongDoesHeWantToEatBuckwheat--) {
            totalNumberOfBuckwheatEaten = totalNumberOfBuckwheatEaten + vasilyEatsKilogramsOfBuckwheatInAMonth;
        }

        System.out.println("Месяцев всего понадобиться для употребления всей гречки Василием: " + totalNumberOfBuckwheatEaten);

        for (; forHowLongDoesHeWantToEatBuckwheat == 0; forHowLongDoesHeWantToEatBuckwheat--) {
            theFullCostOfStoringBuckwheat = storingOneKilogramPerMonthCosts * totalNumberOfBuckwheatEaten;
        }

        System.out.println("Общая стоимость хранения гречки за все время: " + theFullCostOfStoringBuckwheat);
    }
}


