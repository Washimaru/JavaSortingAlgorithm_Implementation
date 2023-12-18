package Project5.src;
import org.junit.*;
import java.util.Arrays;

public class SortTimeTest {

    @Test
    public void selectionSortTime(){
        // Index Sizes: = 10, 20, 50, 100, 200, 500, 1000, 2000, and 5000

        Sort.selectionSort(Sort.randomArray(10, 0, 10), 10);

        Sort.selectionSort(Sort.randomArray(20, -50, 100), 20);

        Sort.selectionSort(Sort.randomArray(50, -100, 10), 50);
        
        Sort.selectionSort(Sort.randomArray(100, -500, 250), 100);

        Sort.selectionSort(Sort.randomArray(200, -200, 700), 200);
        
        Sort.selectionSort(Sort.randomArray(500, -1000, 1000), 500);
        
        Sort.selectionSort(Sort.randomArray(1000, -2000, 700), 1000);
        
        Sort.selectionSort(Sort.randomArray(2000, -3000, 235), 2000);
        
        Sort.selectionSort(Sort.randomArray(5000, -1118, 1994), 5000);
    }

    @Test
    public void insertionSortTime(){
        // Index Sizes: = 10, 20, 50, 100, 200, 500, 1000, 2000, and 5000

        Sort.insertionSort(Sort.randomArray(10, 0, 10));

        Sort.insertionSort(Sort.randomArray(20, -50, 100));

        Sort.insertionSort(Sort.randomArray(50, -100, 10));
        
        Sort.insertionSort(Sort.randomArray(100, -500, 250));

        Sort.insertionSort(Sort.randomArray(200, -200, 700));
        
        Sort.insertionSort(Sort.randomArray(500, -1000, 1000));
        
        Sort.insertionSort(Sort.randomArray(1000, -2000, 700));
        
        Sort.insertionSort(Sort.randomArray(2000, -3000, 235));
        
        Sort.insertionSort(Sort.randomArray(5000, -1118, 1994));
    }

    @Test
    public void quickSortTime(){
        // Index Sizes: = 10, 20, 50, 100, 200, 500, 1000, 2000, and 5000

        Sort.quickSort(Sort.randomArray(10, 0, 10));

        Sort.quickSort(Sort.randomArray(20, -50, 100));

        Sort.quickSort(Sort.randomArray(50, -100, 10));
        
        Sort.quickSort(Sort.randomArray(100, -500, 250));

        Sort.quickSort(Sort.randomArray(200, -200, 700));
        
        Sort.quickSort(Sort.randomArray(500, -1000, 1000));
        
        Sort.quickSort(Sort.randomArray(1000, -2000, 700));
        
        Sort.quickSort(Sort.randomArray(2000, -3000, 235));
        
        Sort.quickSort(Sort.randomArray(5000, -1118, 1994));
    }

    @Test
    public void mergeSortTime(){
        // Index Sizes: = 10, 20, 50, 100, 200, 500, 1000, 2000, and 5000

        Sort.mergeSort(Sort.randomArray(10, 0, 10));

        Sort.mergeSort(Sort.randomArray(20, -50, 100));

        Sort.mergeSort(Sort.randomArray(50, -100, 10));
        
        Sort.mergeSort(Sort.randomArray(100, -500, 250));

        Sort.mergeSort(Sort.randomArray(200, -200, 700));
        
        Sort.mergeSort(Sort.randomArray(500, -1000, 1000));
        
        Sort.mergeSort(Sort.randomArray(1000, -2000, 700));
        
        Sort.mergeSort(Sort.randomArray(2000, -3000, 235));
        
        Sort.mergeSort(Sort.randomArray(5000, -1118, 1994));
    }

    @Test
    public void testJavaSort(){

        double startTime = System.nanoTime();
        
        Arrays.sort(Sort.randomArray(10, 0, 10));
        
        double endTime = System.nanoTime();
        
        System.out.println("Time taken is: " + (endTime - startTime));

        double startTime2 = System.nanoTime();

        Arrays.sort(Sort.randomArray(20, -50, 100));

        double endTime2 = System.nanoTime();

        System.out.println("Time taken is: " + (endTime2 - startTime2));

        double startTime3 = System.nanoTime();

        Arrays.sort(Sort.randomArray(50, -100, 10));

        double endTime3 = System.nanoTime();

        System.out.println("Time taken is: " + (endTime3 - startTime3));

        double startTime4 = System.nanoTime();

        Arrays.sort(Sort.randomArray(100, -500, 250));

        double endTime4 = System.nanoTime();

        System.out.println("Time taken is: " + (endTime4 - startTime4));

        double startTime5 = System.nanoTime();

        Arrays.sort(Sort.randomArray(200, -200, 700));

        double endTime5 = System.nanoTime();

        System.out.println("Time taken is: " + (endTime5 - startTime5));
        
        double startTime6 = System.nanoTime();

        Arrays.sort(Sort.randomArray(500, -1000, 1000));

        double endTime6 = System.nanoTime();

        System.out.println("Time taken is: " + (endTime6 - startTime6));

        double startTime7 = System.nanoTime();

        Arrays.sort(Sort.randomArray(1000, -2000, 700));

        double endTime7 = System.nanoTime();

        System.out.println("Time taken is: " + (endTime7 - startTime7));

        double startTime8 = System.nanoTime();

        Arrays.sort(Sort.randomArray(2000, -3000, 235));

        double endTime8 = System.nanoTime();

        System.out.println("Time taken is: " + (endTime8 - startTime8));

        double startTime9 = System.nanoTime();

        Arrays.sort(Sort.randomArray(5000, -1118, 1994));

        double endTime9 = System.nanoTime();

        System.out.println("Time taken is: " + (endTime9 - startTime9));


    }
}
