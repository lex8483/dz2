public class Main {
    public static void main(String[] args) {

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float g = 2.34f;
        double f = 5.3456;
        char k = 33;
        boolean l = true;

//------------------------------------------------------------------------------------
        double ves1 = 78.2;
        double ves2 = 82.7;
        var totalWeight = ves1 + ves2;
        var difference = ves2 - ves1;
        System.out.println(totalWeight);
        System.out.println(difference);

//------------------------------------------------------------------------------------

        int banana = 80;
        int milk = 105;
        int ice = 100;
        int eggs = 70;
        int weight = banana * 5 + milk * 2 + ice * 2 + eggs * 4;
        weight /= 1000;
        System.out.println("Вес завтрака " + weight + " кг");

//------------------------------------------------------------------------------------


        double wes = 7000;
        double day = 0;
        double day1 = 0;
        day = wes / 250;
        day1 = wes / 500;
        System.out.println("Потеряет в весе по 250 грамм за " + day + " дней" + " и потеярет, если по 500 грамм за " + day1 + " дней");
        double day2 = 0;
        day2 = (day1 + day) / 2;
        System.out.println("В срднем похудеет за " + day2 + " день");

//--------------------------------------------------------------------------------------------

        int masha = 67760;
        double masha1 = 0;
        double sumMasha = 0;
        double sumMasha1 = 0;
        int denis = 83690;
        double denis1 = 0;
        double sumDenis = 0;
        double sumDenis1 = 0;
        int kris = 76230;
        double kris1 = 0;
        double sumKris = 0;
        double sumKris1 = 0;
        // до повышения
        sumMasha = masha * 12;
        sumDenis = denis * 12;
        sumKris = kris * 12;
        // после повышения
        masha1 = masha * 0.1;
        denis1 = denis * 0.1;
        kris1 = kris * 0.1;

        masha += masha1;
        denis += denis1;
        kris += kris1;

        sumMasha1 = masha * 12;
        sumDenis1 = denis * 12;
        sumKris1 = kris * 12;

        System.out.println("Маша теперь получает " + masha + " рублей. Годовой доход вырос на " + (sumMasha1 - sumMasha) + " рублей");
        System.out.println("Денис теперь получает " + denis + " рублей. Годовой доход вырос на " + (sumDenis1 - sumDenis) + " рублей");
        System.out.println("Кристина теперь получает " + kris + " рублей. Годовой доход вырос на " + (sumKris1 - sumKris) + " рублей");


    }
}