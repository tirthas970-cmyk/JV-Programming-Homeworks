//Practice Problems JAVA 101 -- Tirtha Saha

import java.util.Arrays;

public class PRACTICE_PROBLEMS {
    //problem 1
    public static int countOccurrences(int[] arr, int n) {

        int nOccurrences = 0; //constant here 
        for (int num : arr) {
            if (num == n) {
                nOccurrences ++;
            }
        }
        
        return nOccurrences; 
    }

    //problem 2
    public static String reverseArray(int[] arr) {

        int reversed[] = new int[arr.length]; //reversed array

        for (int num = 0; num < arr.length; num++) { 
            reversed[num] = arr[arr.length - 1 - num]; //coverge at midpoint 

        }

        return Arrays.toString(reversed); //returns the actual array, not the location

    }

    //problem 3
    public static double sumGrid(double[][] grid) {

        double sum = 0; 
        for (double[] row : grid) {  //iterates through rows
            for (double element : row) { //iterates through each element in row
                sum = sum + element;
            }
        }

        return sum;

    }

    public static int fib(int n) {

        if (n == 0 ) 
            return 0;
        else if (n == 1) {
            return 1;      
    }

    int a = 0;
    int b = 1;
    int nextNum = 0;
    for (int i = 2; i <= n; i++ ) {
        nextNum = a + b;
        a = b;
        b = nextNum;
    }

    return b;

}
    
}    