package Chapter_2;

/* # 9 # методы класса Arrays # LearnMainArrays */


import java.util.Arrays;

public class LearnMainArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 9, 3, 8, 7};
        int[] arr2 = {1, 9, 3, 11, 5};
        System.out.println(Arrays.equals(arr1, arr2));   // false
        System.out.println(Arrays.compare(arr1, arr2));  // arr1[3]<arr2[3]. Print: -1
        System.out.println(Arrays.binarySearch(arr1, 3)); // arr1[2] = 3
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1)); // after sorting [1, 3, 7, 8, 9]
    }
}
