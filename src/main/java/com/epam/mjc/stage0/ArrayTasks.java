package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String str1 = "winter";
        String str2 = "autumn";
        String str3 = "summer";
        String str4 = "spring";
        String [] arr = new String[4];
        arr[0] = str1;
        arr[1] = str4;
        arr[2] = str3;
        arr[3] = str2;
        for (int i = 0; i <= arr.length;i++){
            System.out.println(arr[i]);
        }
    return seasonsArray();
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        if (length > 0) {
            for (int i = 0; i <= length; i++) {


                generateNumbers(length);
            }
        }
    return generateNumbers(length);
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length;i++){
            sum += arr[i];

        }
    return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for(int i = 0; i <= arr.length;i++){
            int a = arr[i];
            if (a == number){
                return findIndexOfNumber(arr,number);
            }
        }

        return findIndexOfNumber(arr,number);
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        for (int i = 0; i <= arr.length; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return reverseArray(arr);
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        for (int i = 0; i <= arr.length;i++){
            if (arr[i] < 0){
                continue;
            }
        }
        return getOnlyPositiveNumbers(arr);
    }

    
    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        for (int i = 0; i < arr.length;i++ ){
            for (int j = i; j < arr.length;j++){
                if(arr[j-1][i] > arr[j][i]){
                    int t = arr[j][i];
                    arr[j][i] = arr[j-1][i];
                    arr[j-1][i] = t;
                }
            }
        }
        return sortRaggedArray(arr);
    }
}
