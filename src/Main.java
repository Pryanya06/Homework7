public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int totalSaving = 2_459_000;
        int saving = 0;
        int savingPerMonth = 15000;
        int month = 1;
        while (saving <= totalSaving) {
            saving += savingPerMonth;
            System.out.println(" Месяц " + month + " сумма накоплений равна " + saving + " рублей");
            month++;
        }
    }

    public static void task2() {
        System.out.println(" Задача 2");
        int number = 1;
        while (number <=10) {
            System.out.println( number + " ");
            number ++;
        }
        for (int i = 10; i > 0; i --) {
            System.out.println( i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int population2 = population / 1000;
        int bornYear = 17;
        int mortalityYear = 8;
        for (int i = 1; i <= 10; i++) {
            population = population - (mortalityYear * population2) + (bornYear * population);
            System.out.println(" Год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println(" Задача 4");
        int saving = 15000;
        double rate = 1.07;
        int totalSaving = 12_000_000;
        int numberOfMonth = 1;
        while (saving < totalSaving) {
            saving *= rate;
            System.out.println(" Месяц " + numberOfMonth + " сумма накоплений " + saving);
            numberOfMonth++;
        }
    }

    public static void task5() {
        System.out.println(" Задача 5");
        int saving = 15000;
        double rate = 1.07;
        int totalSaving = 12_000_000;
        int numberOfMonth = 1;
        while (saving < totalSaving) {
            saving *= rate;
            if (numberOfMonth % 6 == 0) {
                System.out.println(" Месяц " + numberOfMonth + " сумма накоплений " + saving);
            }
            numberOfMonth++;
        }
        }

    public static void task6() {
        System.out.println(" Задача 6");
        int saving = 15000;
        double rate = 1.07;
        int totalSaving = 12_000_000;
        int numberOfMonth = 1;
        int maxMonth = 108;
        while (numberOfMonth <= maxMonth) {
            saving *= rate;
            if (numberOfMonth % 6 == 0) {
                System.out.println(" Месяц " + numberOfMonth + " сумма накоплений " + saving);
            }
            numberOfMonth++;
        }

    }

    public static void task7() {
        System.out.println(" Задача 7");
        int numberOfFriday = 3;
        for (; numberOfFriday <= 31; numberOfFriday = numberOfFriday + 7) {
            System.out.println(" Сегодня пятница, " + numberOfFriday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println(" Задача 8");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int comletionYear = currentYear + 100;
        int start = 0;
        while (start <= comletionYear) {
            if (start > startYear) {
                System.out.println(start);
            }
            start += 79;
        }
    }
}