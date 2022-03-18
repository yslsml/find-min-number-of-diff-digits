package by.bsu.lab3.operation;

import by.bsu.lab3.creator.ArrayCreator;

public class OperationsIntArray {

    public int findElemWithMinDiffDigits(int[] numbers) {
        int maxDigitElemIndex = 0;  // index of element with max quantity of equal digits
        int maxDigitElem = 0;  // element with max quantity of equal digits
        int[] countArray = factoryCharacteristicArray(numbers); // array of quantity of digits in each number

        for (int i = 0; i < countArray.length; i++) { // find element with max value
            if(countArray[i] > maxDigitElem) { //make function
                maxDigitElemIndex = i;
                maxDigitElem = countArray[i];
            }
        }

        return numbers[maxDigitElemIndex];
    }

    private int[] factoryCharacteristicArray(int[] numbers) { //getCountOfEqualDigitsArray
        int[] countArray = new int[numbers.length];  //array of quantity of digits in each number
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;

            //ArrayCreator creator = new ArrayCreator();
            //int[] digits = creator.factoryCharArray(numbers[i]);  // array of digits of number

            int[] digits = factoryDigitsArray(numbers[i]); // array of digits of number

            for (int j = 0; j < digits.length; j++) {
                for (int k = j + 1; k < digits.length ; k++ ) {
                    if(digits[j] == digits[k]) {
                        count++; // number of equal digits
                    }
                }
            }
            countArray[i] = count;
        }
        return countArray;
    }

    private int[] factoryDigitsArray(int number){
        int[] result = new int[getCountsOfDigits(number)];
        for (int i = 0; i < result.length ; i++) {
            result[result.length - 1 - i] =  number % 10;
            number /= 10;
        }
        return result;
    }

    private int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

}