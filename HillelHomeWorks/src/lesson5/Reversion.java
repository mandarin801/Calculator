package lesson5;

/**
 * Created by mandarin80 on 12.02.17.
 */
public class Reversion {
    private String inputValue;
    private StringBuffer outputValue;
    private String result;

    public String revertAll(String inputValue) {
        outputValue = new StringBuffer(inputValue);
        int lenght = inputValue.length();
        for (int i = 0; i < lenght; i++) {
            outputValue.setCharAt(lenght - 1 - i, inputValue.charAt(i));
        }
        return result = outputValue.toString();
    }
}
