
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
      C2

    }

    /**
     * С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
     * что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
     * <p>
     * Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для накопления
     * данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .
     */

    public static void task1() {
        System.out.println("задача 1");
        int accumulation = 0;
        int month = 1;
        while (accumulation < 2_459_000) {
            accumulation += 15_000;
            System.out.println("Месяц" + month + ", сумма накоплений равна" + accumulation + "рублей");
            month++;
        }
    }

    /**
     * Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
     * <p>
     * На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
     * <p>
     * Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
     * <p>
     * Не забудьте выполнить переход на новую строку между двумя циклами.
     */

    public static void task2() {
        System.out.println("задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * В стране Y население равно 12 миллионов человек.
     * <p>
     * Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая численность населения будет
     * через 10 лет, если показатели рождаемости и смертности постоянны.
     * <p>
     * В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
     */
    public static void task3() {
        System.out.println("задача 3");
        int population = 12_000_000;
        int mortality = 8 * population / 1000;
        int birthRate = 17 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population = population + birthRate - mortality;
            System.out.println("Год" + i + ", численность населения составляет" + population);
        }
    }

    /**
     * Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
     * Первоначальная сумма вклада — 15 тысяч рублей.
     * <p>
     * Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов
     * рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
     * <p>
     * Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
     */
    public static void task4() {
        System.out.println("задача 4");
        int contribution = 15_000;
        int month = 0;
        while (contribution <= 12_000_000) {
            contribution *= 1.07;
            System.out.println("Месяц " + month + " Итого " + contribution);
            month ++;
        }
    }

    /**
     * Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
     * Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
     */
    public static void task5() {
        System.out.println("задача 5");
        int contribution = 15_000;
        int month = 0;
        while (contribution <= 12_000_000) {
            contribution *= 1.07;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + contribution);

            }  month++;
        }
    }

    /**
     * Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать, какой будет сумма его накоплений каждые
     * полгода на протяжении этих 9 лет.
     * <p>
     * Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
     * <p>
     * Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
     */
    public static void task6() {
        System.out.println("задача 6");
        int contribution = 15_000;
        for ( int i = 1; i < 9 * 12; i += 6) {
            int previousAmount = contribution;
            contribution *= 1 + 0.07 * 6;

                System.out.printf("Месяц %d, Итого %d \n", i, contribution - previousAmount);
=======
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
master
        }
        System.out.println();
    }
 C2
    /**
     * Нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит
     * сообщение с напоминанием, что нужно подготовить еженедельный отчет.
     * <p>
     * Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
     * <p>
     * Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида: «Сегодня пятница, ...-е число.
     * Необходимо подготовить отчет».
     * <p>
     * В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным
     * датам.
     */
    public static void task7() {
        System.out.println("задача 7");
        int i = 2;
        for (; i < 31; i = i + 7) {
            System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет");
        }
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

master

    /**
     * Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
     * <p>
     * Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
     * <p>
     * В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления
     * (ближайшие 100 лет).
     * <p>
     * Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего
     * (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
     */
    public static void task8() {
        System.out.println("задача 8");
        int thisYear = 2022;
        int previousYears = thisYear - 200;
        int subsequentYears = thisYear + 100;
        for (int i = previousYears; i < subsequentYears; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
