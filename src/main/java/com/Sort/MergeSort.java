package com.Sort;

public class MergeSort
{
   public void mergeSort(int[] array, int start, int end){
      if (start>=end){
         return;
      }
      int middle= (start + end)/2;
      mergeSort(array,start,middle);
      mergeSort(array,middle+1,end);
      mergehalves(array,start,middle,end);
   }

   private void mergehalves(int[] array, int start,int middle, int end){
         int size1= middle-start+1;
         int size2= end-middle;

         int[] left = new int[size1];
         int[] right = new int[size2];

      for (int i = 0; i < size1; ++i)
         left[i] = array[start + i];
      for (int j = 0; j < size2; ++j)
         right[j] = array[middle + 1 + j];

      int i = 0, j = 0;

      // Initial index of merged subarray array
      int k = start;
      while (i < size1 && j < size2) {
         if (left[i] <= right[j]) {
            array[k] = left[i];
            i++;
         }
         else {
            array[k] = right[j];
            j++;
         }
         k++;
      }

      while (i < size1) {
         array[k] = left[i];
         i++;
         k++;
      }

      /* Copy remaining elements of R[] if any */
      while (j < size2) {
         array[k] = right[j];
         j++;
         k++;
      }



   }

   static void printArray(int arr[])
   {
      int n = arr.length;
      for (int i = 0; i < n; ++i)
         System.out.print(arr[i] + " ");
      System.out.println();
   }

   public static void main(String[] args)
   {
      int arr[] = { 8,3,2,9,7,1,5,4 };

      System.out.println("Given Array");
      printArray(arr);

      MergeSort ob = new MergeSort();
      ob.mergeSort(arr, 0, arr.length - 1);

      System.out.println("\nSorted array");
      printArray(arr);
   }
}
