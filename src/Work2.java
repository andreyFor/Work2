public class Work2 {
    public static void main(String[] args) {
        System.out.println("Helow world!");


        // Задание номер 1

        byte a = 10 ;
        short b = 75 ;
        int c = 102 ;
        long d = 200L ;
        float e = 4.5f ;
        double f = 1.56 ;
        boolean g = true;
        char h = 33 ;

        // Задание номер 2

        double boxer1 = 78.2 ;
        double boxer2 = 82.7 ;
        double totalWeightOfBoxers = boxer1 + boxer2 ;
        System.out.println( "Общий вес боксеров " + totalWeightOfBoxers + " кг") ;
        double boxerWeightDifference = boxer2 - boxer1 ;
        System.out.println( "Разница в весе боксеров " + boxerWeightDifference + " кг");

        // Задание номер 3

        byte bananas = 5;
        byte bananaWeight = 80;
        short milk = 200;
        short milkWeight100 = 105;
        short iceCream = 2;
        short iceCreamWeight = 100;
        byte eggs = 4;
        byte aggWeight = 70;
        short totalWeightOfBananas = 5 * 80;
        short totalWeightOfMilk = 2 * 105;
        short totalWeightOfIceCream = 2 * 100;
        short totalWeightOfEggs = 4 * 70;
        System.out.println("общий вес завтрака " + (totalWeightOfBananas + totalWeightOfMilk + totalWeightOfIceCream + totalWeightOfEggs) + " гр");
        short breakfastWeightInKilograms = (short) (totalWeightOfBananas + totalWeightOfMilk + totalWeightOfIceCream + totalWeightOfEggs);
        double breakfastWeightInKilograms1 = (short) (breakfastWeightInKilograms / 1000);
        System.out.println( "при переводе завтрака в килограмы вышло " + breakfastWeightInKilograms1 + " килограм ");



        // Задание номер 4

        byte weightToLoseWeightInKilogram = 7;
        short kilogramWeight = 1000;
        short weightInKilogram = (short) (weightToLoseWeightInKilogram * kilogramWeight);
        short loseWeightBy250 = 250;
        short loseWeightBy500 = 500;
        short numberOfDays250 = ( short ) (weightInKilogram / loseWeightBy250);
        System.out.println( numberOfDays250 + " дней для похудения в 250 гр в день" );
        short numberOfDays500 = (short) (weightInKilogram / loseWeightBy500);
        System.out.println(numberOfDays500 + " дней для похудения в 500 гр в день");
        short averageNumberOfDays = (short) ((numberOfDays250 + numberOfDays500)  /  2);


        // не знаю как записать сюда коментарий количество средних дней(строка сверху)


        System.out.println(averageNumberOfDays);



        // Задание номер 5

        int mashaSalary = 67760;
        int numberOfMonthsInAYear = 12;
        int masha10PercentIncrease = (mashaSalary / 100) * 10;
        int mashaAmountAfterIncrease = mashaSalary + masha10PercentIncrease;
        int mashaAnnualSalaryBeforeIncrease = mashaSalary * numberOfMonthsInAYear;
        int mashaAnnualSalaryAfterPromotion = mashaAmountAfterIncrease * numberOfMonthsInAYear;
        int mashaDifferenceBetweenSalaryIncrease = mashaAnnualSalaryAfterPromotion - mashaAnnualSalaryBeforeIncrease;
        System.out.println("Маша теперь получает " + mashaAmountAfterIncrease + " рублей " + " годовой доход вырос на " + mashaDifferenceBetweenSalaryIncrease + " рублей" );


        int denisSalary = 83690;
        int denis10PercentIncrease = (denisSalary / 100) * 10;
        int denisAmountAfterIncrease = denisSalary + denis10PercentIncrease;
        int denisAnnualSalaryBeforeIncrease = denisSalary * numberOfMonthsInAYear;
        int denisAnnualSalaryAfterPromotion = denisAmountAfterIncrease * numberOfMonthsInAYear;
        int denisDifferenceBetweenSalaryIncrease = denisAnnualSalaryAfterPromotion - denisAnnualSalaryBeforeIncrease;
        System.out.println("Денис теперь получает " + denisAmountAfterIncrease + " рублей " + " годовой доход вырос на " + denisDifferenceBetweenSalaryIncrease + " рублей");


        int kristinaSalary = 76230;
        int kristina10PercentIncrease = (kristinaSalary / 100) * 10;
        int kristinaAmountAfterIncrease = kristinaSalary + kristina10PercentIncrease;
        int kristinaAnnualSalaryBeforeIncrease = kristinaSalary * numberOfMonthsInAYear;
        int kristinaAnnualSalaryAfterPromotion = kristinaAmountAfterIncrease * numberOfMonthsInAYear;
        int kristinaDifferenceBetweenSalaryIncrease = kristinaAnnualSalaryAfterPromotion - kristinaAnnualSalaryBeforeIncrease;
        System.out.println("Кристина теперь получает " + kristinaAmountAfterIncrease + " рублей " + "годовой доход вырос на " + kristinaDifferenceBetweenSalaryIncrease + " рублей");














    }
}
