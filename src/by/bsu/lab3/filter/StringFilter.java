package by.bsu.lab3.filter;

public class StringFilter {

    public static final String REGEX = "[+-]?\\d+"; //  "\\d+" - только со знаком плюс

    public String[] filterInt(String[] numbers) {
        int counter = 0;
        for (String numberString : numbers
        ) {
            if (numberString.matches(REGEX)){
                counter++;
            }
        }
        String[] validStr = new String[counter];
        int i = 0;
        for (String numberString : numbers) {
            if (numberString.matches(REGEX)){
                validStr[i++] = numberString;
            }
        }
        return validStr;
    }
}
