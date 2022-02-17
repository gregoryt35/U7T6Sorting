import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {3, 86, -20, 1, 14, 40, 19, -4, 100, 89, 13, 54, -400, 78, 43, 12, 77, -5, 0, 6};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {3, 86, -20, 1, 14, 40, 19, -4, 100, 89, 13, 54, -400, 78, 43, 12, 77, -5, 0, 6};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
