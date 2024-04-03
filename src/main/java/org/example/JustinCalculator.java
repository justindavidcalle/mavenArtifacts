package org.example;


public class JustinCalculator {

    public int addInt(int x, int y){
        int result;
        result = x + y;
        return result;
    }


    public int multiplyInt(int x, int y){
        int result;
        result = x * y;

        return result;
    }

    public int sumIntArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

}
