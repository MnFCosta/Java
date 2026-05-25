public class Main {
    static void main() {
        System.out.println(formula(1.0, 88, 38, 0.15));
    }

    public static Double formula(Double btba, Integer agi, Integer dex, Double SM){
        Double wDelay = 50 * btba;
        Double wDelayAGI = Math.ceil(wDelay* (agi/25.0));
        Double wDelayDex = Math.ceil(wDelay* (dex/100.0));


        double finalASPD = 200 - (wDelay-((wDelayAGI + wDelayDex) / 10)) * (1-SM);

        return finalASPD;
    }
}

[]