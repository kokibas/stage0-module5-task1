package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Complexity;

import java.util.LinkedList;

/**
 * Tasks for assessing the algorithm complexity.
 * The following are the ratios of the constants with the BigO estimate:
 * <p>
 * Complexity.O_LOG_N       -> O(log N)
 * Complexity.O_N_2         -> O(log N^2)
 * Complexity.O_FACTORIAL_N -> O(!N)
 * Complexity.O_2_N         -> O(2 * N)
 * Complexity.O_N_LOG_N     -> O(N * log N)
 * Complexity.O_1           -> O(1)
 * Complexity.O_N           -> O(N)
 */
public class AlgorithmComplexity {

    /**
     * Return the linear search complexity if the element you are looking for is at the end of the array.
     */
    public Complexity badLinerSearch( ) {

        int arr1[] = new int [10];
        int elementSearch = 10;
        for (int i = arr1.length; i >= arr1.length - 1; i--){
            if (arr1[i] == elementSearch){
                return badLinerSearch();
            }

        }
        return badLinerSearch();
    }

    /**
     * Return the complexity of accessing an array element by index.
     */
    public Complexity arrayIndexItemAccess() {
        String str1 = new String("AccessItem");
        String str2 = new String("ByIndex");
        LinkedList   arr2 = new LinkedList<>();
        arr2.add(0,str1);
        arr2.add(0,str2);
        return arrayIndexItemAccess();
    }

    /**
     * Return the complexity of a binary search.
     */
    public Complexity binarySorting() {
        int first = 1;
        int last = 10;
        int arr3[] = new int[10];
        int element = 7;
    int  mid = (first + last) / 2;
    while (first < last){
        if (arr3[mid] < element){
            first = mid + 1;
        } else if (arr3[mid] == element) {
            System.out.println("found");
            break;
        }else {
            last = mid - 1;
        }
        mid = (first + last) / 2;
    }
    return binarySorting();
    }

    /**
     * Return the complexity of the twoCycleSorting algorithm.
     */
    public Complexity twoCycleSorting() {


    return twoCycleSorting();
    }
}
