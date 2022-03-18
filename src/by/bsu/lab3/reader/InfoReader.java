package by.bsu.lab3.reader;
import java.io.InputStream;
import java.util.Scanner;

public class InfoReader {

    public static final String REGEX_DELIMITR = "\\s+";

    public String[] readStringArray(InputStream input){
        Scanner scanner = new Scanner(input);
        String line = scanner.nextLine();
        line = line.trim();
        String[] numbers = line.split(REGEX_DELIMITR);
        scanner.close();
        return numbers;

    }
}