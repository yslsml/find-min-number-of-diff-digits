package by.bsu.lab3.run;
import by.bsu.lab3.creator.ArrayCreator;
import by.bsu.lab3.filter.StringFilter;
import by.bsu.lab3.operation.OperationsIntArray;
import by.bsu.lab3.reader.InfoReader;
import java.util.Arrays;

public class Main {
    /*Ввести n чисел.
    4.Дано n заданных чисел. Найти число, в котором число различных цифр минимально. (Т.е. максисальное число одинаковых цифр)
    Если таких чисел несколько, найти первое из них.*/

    public static void main(String[] args) {

        String[] strings;

        if (args.length == 0){
            System.out.println("Array of arguments from command line is empty. \nPlease, enter array of integer numbers as line: ");
            InfoReader reader = new InfoReader();
            strings = reader.readStringArray(System.in);
        }
        else {
            System.out.println("Array of integer numbers from arguments of command line: ");
            strings = args;
        }

        StringFilter filter = new StringFilter();
        String[] strNumbers = filter.filterInt(strings);
        ArrayCreator creator = new ArrayCreator();
        int numbers[] = creator.factoryIntArray(strNumbers);
        System.out.println("Array of numbers:\n" + Arrays.toString(numbers));

        OperationsIntArray operation = new OperationsIntArray();
        int res = operation.findElemWithMinDiffDigits(numbers);
        System.out.println("\nNumber with minimum different digits is " + res);

    }
}
