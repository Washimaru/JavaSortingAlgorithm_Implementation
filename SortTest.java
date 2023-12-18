package Project5.src;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class SortTest {

    @Test
    public void testSeletionSort(){
        int[] tempArray = {5, 3, 7, 8};

        Sort.selectionSort(tempArray, tempArray.length);

        assertEquals("3 5 7 8", Sort.putArrToString(tempArray));

        int[] temp2Array = {5, 3};

        Sort.selectionSort(temp2Array, temp2Array.length);

        assertEquals("3 5", Sort.putArrToString(temp2Array));

        int[] temp3Array = {4, 2, 10, 5, 3, 9, 8, 7, 11, 10, 1, 0, -1};

        Sort.selectionSort(temp3Array, temp3Array.length);

        assertEquals("-1 0 1 2 3 4 5 7 8 9 10 10 11", Sort.putArrToString(temp3Array));

        int[] temp4Array = {4, 4, 4, 4, 4, 4, 4};
        
        Sort.selectionSort(temp4Array, temp4Array.length);

        assertEquals("4 4 4 4 4 4 4", Sort.putArrToString(temp4Array));
    }

    @Test
    public void testInsertionSort(){
        int[] tempArray = {5, 3, 7, 8};

        Sort.insertionSort(tempArray);

        assertEquals("3 5 7 8", Sort.putArrToString(tempArray));

        int[] temp2Array = {5, 3};

        Sort.insertionSort(temp2Array);

        assertEquals("3 5", Sort.putArrToString(temp2Array));

        int[] temp3Array = {4, 2, 10, 5, 3, 9, 8, 7, 11, 10, 1, 0, -1};

        Sort.insertionSort(temp3Array);

        assertEquals("-1 0 1 2 3 4 5 7 8 9 10 10 11", Sort.putArrToString(temp3Array));

        int[] temp4Array = {4, 4, 4, 4, 4, 4, 4};
        
        Sort.insertionSort(temp4Array);

        assertEquals("4 4 4 4 4 4 4", Sort.putArrToString(temp4Array));
    }
    
    @Test
    public void testMergeSort(){
        int[] tempArray = {5, 3, 7, 8};

        Sort.mergeSort(tempArray);

        assertEquals("3 5 7 8", Sort.putArrToString(tempArray));

        int[] temp2Array = {5, 3};

        Sort.mergeSort(temp2Array);

        assertEquals("3 5", Sort.putArrToString(temp2Array));

        int[] temp3Array = {4, 2, 10, 5, 3, 9, 8, 7, 11, 10, 1, 0, -1};

        Sort.mergeSort(temp3Array);

        assertEquals("-1 0 1 2 3 4 5 7 8 9 10 10 11", Sort.putArrToString(temp3Array));

        int[] temp4Array = {4, 4, 4, 4, 4, 4, 4};
        
        Sort.mergeSort(temp4Array);

        assertEquals("4 4 4 4 4 4 4", Sort.putArrToString(temp4Array));

    }

    @Test
    public void testQuickSort(){
        int[] tempArray = {5, 3, 7, 4};

        Sort.quickSort(tempArray);

        assertEquals("3 4 5 7", Sort.putArrToString(tempArray));

        int[] temp2Array = {5, 3};

        Sort.quickSort(temp2Array);

        assertEquals("3 5", Sort.putArrToString(temp2Array));

        int[] temp3Array = {4, 2, 10, 5, 3, 9, 8, 7, 11, 10, 1, 0, -1};

        Sort.quickSort(temp3Array);

        assertEquals("-1 0 1 2 3 4 5 7 8 9 10 10 11", Sort.putArrToString(temp3Array));

        int[] temp4Array = {4, 4, 4, 4, 4, 4, 4};

        Sort.quickSort(temp4Array);

        assertEquals("4 4 4 4 4 4 4", Sort.putArrToString(temp4Array));

    }

}
