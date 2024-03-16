public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int a = 33139;
        byte b = -24;
        short c = 24456;
        long d = -511222333;
        float e = 2.50f;
        double f = 7.12345678;
        System.out.println("Значение переменной а с типом int равно " +a);
        System.out.println("Значение переменной b с типом byte равно " +b);
        System.out.println("Значение переменной c с типом short равно " +c);
        System.out.println("Значение переменной d с типом long равно " +d);
        System.out.println("Значение переменной e с типом float равно " +e);
        System.out.println("Значение переменной f с типом double равно " +f);

        //Задание 2
        float g = 27.12f;
        long h = 987_678_965_549L;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;

        //Задание 3
        System.out.println("Задание 3");
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short totalPaper = 480;

        int totalStudent = ludmila + anna + ekaterina;
        int oneStudent=totalPaper/totalStudent;
        System.out.println("На каждого ученика рассчитано " +oneStudent+ " листов бумаги.");

        //Задание 4
        System.out.println("Задание 4");
        byte bottle = 16;
        byte minute = 2;
        byte minutes = 20;
        byte day = 1;
        byte days = 3;
        byte month = 1;

        int productivityOneMinute=bottle/minute;
        int productivityTwentyMinute = productivityOneMinute * minutes;
        System.out.println("За " +minutes+ " минут машина произвела " +productivityTwentyMinute+ " штук бутылок");
        int productivityDay=productivityOneMinute * day * 24 * 60;
        System.out.println("За " +day+ " день машина произвела " +productivityDay+ " штук бутылок");
        int productivityThreeDay=productivityDay * days;
        System.out.println("За " +days+ " дня машина произвела " +productivityThreeDay+ " штук бутылок");
        int productivityMonth=productivityDay * month * 30;
        System.out.println("За " +month+ " месяц машина произвела " +productivityMonth+ " штук бутылок");

        //Задание 5
        System.out.println("Задание 5");
        byte totalPaints = 120;
        byte oneClassOfWhitePaint = 2;
        byte oneClassOfBrownPaint = 4;

        int classesInSchool=totalPaints / (oneClassOfWhitePaint + oneClassOfBrownPaint);
        int whitePaints=classesInSchool * oneClassOfWhitePaint;
        int brownPaints=classesInSchool * oneClassOfBrownPaint;
        System.out.println("В школе, где " +classesInSchool+" классов," +
                " нужно "+whitePaints+" банок белой краски и "+brownPaints+" банок коричневой краски.");

        //Задание 6
        System.out.println("Задание 6");
        byte bananas = 5;
        int milk = 200;
        byte iceCream = 2;
        byte eggs = 4;

        int weight = bananas * 80 + milk * 105/100 + iceCream * 100 + eggs * 70;
        float weightKg = weight/1000f;
        System.out.println("Вес спортзавтрака " +weight+ " грамм " +
                "или " +weightKg+ " килограмм");

        //Задание 7
        System.out.println("Задание 7");
        int totalWeight = 7;
        int oneDayTheFirstVariant = 250;
        int oneDayTheSecondVariant = 500;

        int resultTheFirstVariant = totalWeight * 1000/oneDayTheFirstVariant;
        int resultTheSecondVariant = totalWeight * 1000/oneDayTheSecondVariant;
        System.out.println("Если скидывать по " +oneDayTheFirstVariant+" грамм нужно "
                +resultTheFirstVariant+ " дней");
        System.out.println("Если скидывать по " +oneDayTheSecondVariant+" грамм нужно "
                +resultTheSecondVariant+ " дней");

        //Задание 8
        System.out.println("Задание 8");
        int currentSalaryMasha = 67760;
        int currentSalaryDenis = 83690;
        int currentSalaryChristina = 76230;
        float percent = 0.1f;
        int monthYear = 12;

        float newSalaryMasha = currentSalaryMasha + currentSalaryMasha * percent;
        float salaryYearMasha = (newSalaryMasha - currentSalaryMasha) * monthYear;
        System.out.println("Маша теперь получает "+newSalaryMasha+" рублей." +
                " Годовой доход вырос на " +salaryYearMasha+" рублей");
        float newSalaryDenis = currentSalaryDenis + currentSalaryDenis * percent;
        float salaryYearDenis = (newSalaryDenis - currentSalaryDenis) * monthYear;
        System.out.println("Денис теперь получает "+newSalaryDenis+" рублей." +
                " Годовой доход вырос на " +salaryYearDenis+" рублей");
        float newSalaryChristina = currentSalaryChristina + currentSalaryChristina * percent;
        float salaryYearChristina = (newSalaryChristina - currentSalaryChristina) * monthYear;
        System.out.println("Кристина теперь получает "+newSalaryChristina+" рублей." +
                " Годовой доход вырос на " +salaryYearChristina+" рублей");
    }
}