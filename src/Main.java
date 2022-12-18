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
        task9();
        task10();


    }

    public static void task1() {
        System.out.println("задача 1");
        for (int i = 1; i < 10; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("задача 2");
        for (int i = 10; i > 1; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("задача 4");
        for (int i = 10; i > -10; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("задача 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }
    }

    public static void task6() {
        System.out.println("задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("задача 8");
        int contribution = 29_000;
        int amountOfSavings = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            amountOfSavings = amountOfSavings + contribution;
            System.out.println("Месяц" + i + ", сумма накоплений равна" + amountOfSavings + "рублей");
        }
    }

    public static void task9() {
        System.out.println("задача 9");
        int contribution = 29_000;
        double amountOfSavingsWithProcent = 0;
        for (int i = 0; i <= 12; i = i + 1) {
            amountOfSavingsWithProcent = amountOfSavingsWithProcent + amountOfSavingsWithProcent / 100;
            amountOfSavingsWithProcent = amountOfSavingsWithProcent + contribution;
            System.out.println("Месяц" + i + ", сумма накоплений равна" + amountOfSavingsWithProcent + "рублей");
        }

    }

    public static void task10() {
        System.out.println("задача 10");
        int N = 2;
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(N + " * " + i + " = "
                    + N * i);
        }


    }
}
