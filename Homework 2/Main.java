

public class Main {
    public static void main(String[] args) {

        //checking problem 1
        int[] arr = {4, 3, 2, 8, 3};
        System.out.println(PRACTICE_PROBLEMS.countOccurrences(arr, 3));

        //checking problem 2

        int[] arry = {5, 4, 1, 9, 7}; 

        System.out.println(PRACTICE_PROBLEMS.reverseArray(arry));

        //checking problem 3

        double[][] grid = {
            {2, 3, 4, 5},
            {5, 7, 9, 11},
            {12, 12, 15, 1}
        };

        System.out.println(PRACTICE_PROBLEMS.sumGrid(grid));

        //checking problem 4

        System.out.println(PRACTICE_PROBLEMS.fib(5));

    }
}