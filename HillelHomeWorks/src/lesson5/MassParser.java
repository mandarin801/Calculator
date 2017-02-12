package lesson5;

/**
 * Created by mandarin80 on 12.02.17.
 */
public class MassParser {
    public String parse(String mass){
        StringBuffer outputValue = new StringBuffer();
        int lenght = mass.length();
        StringBuffer milligrams = new StringBuffer("");
        StringBuffer grams;
        StringBuffer kilos = new StringBuffer("");
        StringBuffer tons = new StringBuffer("");
        if (mass.indexOf('.') >= 0) {
            milligrams = new StringBuffer(mass.substring(mass.indexOf('.') + 1,lenght));
            if (milligrams.length() == 1){
                milligrams = milligrams.append("00");
            } else if (milligrams.length() == 2) {
                milligrams = milligrams.append(0);
            }
            lenght = lenght - (lenght - mass.indexOf('.'));
        }
        int numberOfDigits = lenght/3;
        String microgramsName = " micrograms";
        String gramsName = " grams ";
        String kilosName = " kilos ";
        String tonsName = " tons ";


        System.out.println(numberOfDigits);
        switch (numberOfDigits) {
            case 0:
                grams = new StringBuffer(mass);
                //outputValue = outputValue.append(grams).append(gramsName);
                break;
            case 1:
                grams = new StringBuffer(mass.substring(lenght - 3, lenght));
                kilos = new StringBuffer(mass.substring(0, lenght - 3));
                //outputValue = outputValue.append(kilos).append(kilosName).append(grams).append(gramsName);
                break;
            default:
                grams = new StringBuffer(mass.substring(lenght - 3, lenght));
                kilos = new StringBuffer(mass.substring(lenght - 6, lenght - 3));
                tons = new StringBuffer(mass.substring(0, lenght - 6));
                //outputValue = outputValue.append(tons).append(tonsName).append(kilos).append(kilosName).
                        //append(grams).append(gramsName);
                break;
        }

        if (!tons.toString().equals("") && !tons.toString().equals("000")) {
            outputValue = outputValue.append(tons).append(tonsName);
        } if (!kilos.toString().equals("") && !kilos.toString().equals("000")) {
            outputValue = outputValue.append(kilos).append(kilosName);
        } if (!grams.toString().equals("000")){
            outputValue = outputValue.append(grams).append(gramsName);
        } if (!milligrams.toString().equals("")) {
            outputValue = outputValue.append(milligrams).append(microgramsName);
        }
        return outputValue.toString();
    }
}
