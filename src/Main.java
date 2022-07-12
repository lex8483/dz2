public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float g = 2.34f;
        double f = 5.3456;
        char k = 'c';
        boolean l = true;
        System.out.println("--------------------------------------------------");
        System.out.println(k);
    }

    //------------------------------------------------------------------------------------
    public static void task2() {

        double ves1 = 78.2;
        double ves2 = 82.7;
        var totalWeight = ves1 + ves2;
        var difference = Math.abs(ves1 - ves2);
        System.out.println(totalWeight);
        System.out.println(difference);
        System.out.println("--------------------------------------------------");

    }

    //------------------------------------------------------------------------------------
    public static void task3() {
        int banana = 80;
        int milk = 105;
        int ice = 100;
        int eggs = 70;
        int weight = banana * 5 + milk * 2 + ice * 2 + eggs * 4;
        weight /= 1000;
        System.out.println("Вес завтрака " + weight + " кг");
        System.out.println("--------------------------------------------------");

    }

    //------------------------------------------------------------------------------------
    public static void task4() {

        int wes = 7000;
        int day = wes / 250;
        int day1 = wes / 500;
        System.out.println("Потеряет в весе по 250 грамм за " + day + " дней" + " и потеярет, если по 500 грамм за " + day1 + " дней");
        double day2 = (day1 + day) / (2 * 1.0);
        System.out.println("В срднем похудеет за " + day2 + " день");
        System.out.println("--------------------------------------------------");

    }

    //--------------------------------------------------------------------------------------------
    public static void task5() {
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        // до повышения
        int sumMasha = masha * 12;
        int sumDenis = denis * 12;
        int sumKris = kris * 12;
        // после повышения
        var masha1 = masha * 0.1;
        var denis1 = denis * 0.1;
        var kris1 = kris * 0.1;

        masha += masha1;
        denis += denis1;
        kris += kris1;

        int sumMasha1 = masha * 12;
        int sumDenis1 = denis * 12;
        int sumKris1 = kris * 12;

        System.out.println("Маша теперь получает " + masha + " рублей. Годовой доход вырос на " + (sumMasha1 - sumMasha) + " рублей");
        System.out.println("Денис теперь получает " + denis + " рублей. Годовой доход вырос на " + (sumDenis1 - sumDenis) + " рублей");
        System.out.println("Кристина теперь получает " + kris + " рублей. Годовой доход вырос на " + (sumKris1 - sumKris) + " рублей");
        System.out.println("--------------------------------------------------");

    }

}