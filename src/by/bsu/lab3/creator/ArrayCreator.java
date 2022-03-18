package by.bsu.lab3.creator;

public class ArrayCreator {

    public int[] factoryIntArray(String[] values){
        int[] result = new int[values.length];
        for (int i = 0; i < values.length ; i++) {
            result[i] = Integer.parseInt(values[i]);
        }
        return  result;
    }

}
