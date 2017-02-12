package lesson5;

/**
 * Created by mandarin80 on 12.02.17.
 */
public class Reversion {
    public static void main(String[] args) {
        String number = "123456";
        StringBuffer tmpNumber = new StringBuffer(number);
        int lenght = number.length();
        for (int i = 0; i < lenght; i++) {
            tmpNumber.setCharAt(lenght - 1 - i, number.charAt(i));
        }
        System.out.println(tmpNumber);
    }
}
