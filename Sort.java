package Project5.src;

import java.lang.IllegalArgumentException;
import java.util.Random;

public class Sort {

    // Method which starts insertion Sort
    public static void insertionSort(int[] arr) {

        // starts the measuring of time 
        double startTime = System.nanoTime();

        // loop to loop through the arr array
        for (int i = 1; i < arr.length; i++) {
            // checks if the arr[i-1] value is greater than arr[i]
            if (arr[i] < arr[i - 1]) {
                // stores arr[i] value into a temp variable
                int temp = arr[i];
                int j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j = j - 1;
                }
                // it restores temp value into the index of j
                arr[j] = temp;
            }

        }
        // ending of measuring of time
        double endTime = System.nanoTime();
        // measuring of how long it takes
        double timeTaken = endTime - startTime;
        // prints out how how long it took 
        System.out.println("Time taken is: " + timeTaken);

    }

    // The drive code for quick Sort method 
    // Method which initiates the start for quick sort
    public static void quickSort(int[] arr) {

        // starts the measuring of time 
        double startTime = System.nanoTime();
        // starts the recursion/quick sort algorithm
        qSort(arr, 0, arr.length - 1);
        // ending of measuring of time
        double endTime = System.nanoTime();
        // measuring of how long it takes
        double timeTaken = endTime - startTime;
        // prints out how how long it took 
        System.out.println("Time taken is: " + timeTaken);
    }

    private static void qSort(int[] arr, int first, int last) {
        // base case for recursion to end
        if (first>= last) 
            return;

        // Variable which stores the pivot point/decides where the array should be divided and does swapping of values
        int mid = partition(arr, first, last);
        // After sorting it out in the initial step, quick sorts the first part of the array, which is less than the pivot value
        qSort(arr, first, mid - 1);
        // After sorting it out in the initial step, quick sorts the second part of the array, which is gerater than the pivot value
        qSort(arr, mid, last);
    }

    // partition method which decides pivot values, and sort the array based on the pivot values
    private static int partition(int[] arr, int first, int last) {
        // variable which decides pivot value of how the array should be sorted
        int pivot = arr[(first + last) / 2];
        while (first <= last) {
            // increases the first index variable by one if the arr[first] value is less than the pivot value
            while (arr[first] < pivot) 
                first++;
            // decreases the last index variable by one if the arr[last] value is greater than the pivot value
            while (arr[last] > pivot) 
                last--;
            //  checks when last value is greater than or equal to first index value
            if (first <= last) {
                // if the if condition is met, then swap method is called to switch between first and last elements
                swap(arr, first, last);
                first++;
                last--;
            }
        }
        return first;
    }

    // Swapping method which swaps the i and j, if i and j are in wrong locations
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // driver code for merge Sort method
    public static void mergeSort(int[] arr) {
        // starts the measuring of time 
        double startTime = System.nanoTime();
        // the temporary array which is used to copy over values when the array is split and merged
        int[] tempArray = new int[arr.length];
         // starts the recursion/sort algorithm
        sort(arr, tempArray, 0, arr.length - 1);
        // ending of measuring of time
        double endTime = System.nanoTime();
        // measuring of how long it takes
        double timeTaken = endTime - startTime;
        // prints out how how long it took 
        System.out.println("Time taken is: " + timeTaken);
    }

    // private helper method in order to merge sort the arr array
    private static void sort(int[] arr, int[] tempArray, int start, int end) {
        // checks while end index is greater than start index
        if (start < end) {
            // decides on the mid value to split the arr into two different arrays
            int mid = (start + end) / 2;
            // recursive method is called in order to split the first part of the array
            sort(arr, tempArray, start, mid);
            // recursive method is called to split the second part of the array
            sort(arr, tempArray, mid + 1, end);
            // recursive method of merge is called after when all the methods are splitted, then they are merged together
            merge(arr, tempArray, start, mid + 1, end);
        }   

    }

    // helper method of merge
    private static void merge(int[] arr, int[] tempArray, int start, int mid, int end) {
        // variable to store the index mid - 1
        int midEnd = mid - 1;
        // Variable to store the index of start
        int storeStart = start;
        // variable to start the number of elements to be stored 
        int numElementStore = end - start + 1;

        // checks for when midEnd is greater than or equal to midEnd, and when end is greater than or equal to mid
        while (start <= midEnd && mid <= end) {
            // to temporarily store arr[start] values from the first part of the array to tempArray
            // start and storeStart is increased by one each time it is called
            if (arr[start] <= arr[mid]) {
                tempArray[storeStart++] = arr[start++];
            } 
            // to temporarily store arr[mid] values from the second part of the array to tempArray
            // mid and storeStart is increased by one every time
            else {
                tempArray[storeStart++] = arr[mid++];
            }
        }

        // To copy the first half
        while (start <= midEnd) {
            tempArray[storeStart++] = arr[start++];
        }

        // To copy the second half
        while (mid <= end) {
            tempArray[storeStart++] = arr[mid++];
        }

        // to copy tempArry back
        for (int i = 0; i < numElementStore; i++, end--) {
            arr[end] = tempArray[end];
        }
    }

    // selection sort number
    public static void selectionSort(int[] arr, int length) {
        // starts the measuring of time 
        double startTime = System.nanoTime();
        for (int i = 0; i < length - 1; i++) {
            // searches for the smallest element within the array
            int j = indexSmallest(arr, i, length - 1);
            swap(arr, i, j);
        }
        // ending of measuring of time
        double endTime = System.nanoTime();
        // measuring of how long it takes
        double timeTaken = endTime - startTime;
        // prints out how how long it took 
        System.out.println("Time taken is: " + timeTaken);
    }

    // returns the index which has the smallest element
    private static int indexSmallest(int[] arr, int lower, int higher) {
        int minIndex = lower;
        // goes through the array 
        for (int i = lower + 1; i <= higher; i++){
            // compares the minIndex's element with one after it
            if (arr[i] < arr[minIndex])
                minIndex = i;
        }
        return minIndex;
    }

    public static String putArrToString(int[] arr) {
        if (arr == null || arr.length == 0)
            return "";
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                b.append(arr[i] + " ");
            else
                b.append(arr[i]);
        }
        return b.toString();
    }

    // takes in integer n, int a, and int b 
    // a decides the minimum range 
    // b decides the maximum value
    // n decides the size of the array
    public static int[] randomArray(int n, int a, int b) throws IllegalArgumentException{

        if ((a > b) || (b > Integer.MAX_VALUE || a < Integer.MIN_VALUE))
            throw new IllegalArgumentException("It is an invalid index"); 
        //instance of random class  
        Random rand = new Random(); 
        int minimum = a;
        int maximum = b;
        int randomValue;
        //generate random values from 0-24
        int[] randomArr = new int[n];

        for (int i = 0; i < randomArr.length; i++){
            randomValue = rand.nextInt(minimum, maximum + 1); 
            randomArr[i] = randomValue;
        }

        return randomArr;
    }

    public static void main(String[] args){
        System.out.println("This is a project where I wrote many sorting algorithms");
        System.out.println("I wrote selection, merge, quick and insertion sort");
        System.out.println("Then I benchmarked them as wells as Java's Arrays.sort(arr)");
    }
}
