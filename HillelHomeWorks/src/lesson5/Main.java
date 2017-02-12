package lesson5;


/**
 * Created by mandarin80 on 12.02.17.
 */
public class Main {
    public static void main(String[] args) {
        Reversion reversion = new Reversion();
        //System.out.println(reversion.revertAll("123456"));
        MassParser massParser = new MassParser();
        System.out.println(massParser.parse("12300000.876"));
    }
}
