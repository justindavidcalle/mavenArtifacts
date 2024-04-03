package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JustinCalculator justinCalculator = new JustinCalculator();

        int resultAddFunction = justinCalculator.addInt(3,2);

        int[] numbers = {1, 2, 3, 4, 5};

        int resultSumIntArrayFunction = justinCalculator.sumIntArray(numbers);

        System.out.println("test");

        System.out.println(resultSumIntArrayFunction);
    }
}
