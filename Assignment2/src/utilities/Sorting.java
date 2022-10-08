package utilities;
import java.util.Comparator;


public final class Sorting {
     
	
	/* This bubble sort method is used to sort the Shape Array 
	 * Can used to compare based on the volume and base area
	 * @param <T> array 
	 */
	public static <T> void bubbleSort(Comparable<T> [] array, Comparator<? super T> compare)
	{
		boolean sorted = false;
		Comparable<T> temp;
		while(!sorted)
		{
			sorted = true;
			for ( int i = 0; i < array.length - 1 ; i++)
			{
				if( compare.compare( (T) array[i], (T) array[i+1] ) < 0)// array[0] > array[1];
				{
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1]= temp;
					sorted = false;
					
					
				}
			}
		}
	}
	
	
	/* This bubble sort method is used to sort the Shape Array 
	 * Can used to compare based on the volume and base area
	 * @param <T> array 
	 */
	public static <T> void bubbleSortHeight(Comparable<T>[] array)
	{
		boolean sorted = false;
		Comparable<T> temp;
		while(!sorted)
		{
			sorted = true;
			for ( int i = 0; i < array.length - 1 ; i++)
			{
				if(  array[i].compareTo((T) array[i + 1]) < 0) 
				{
					temp = array[i];
					array[i + 1]= temp;
					sorted = false;
					
					
				}
			}
		}
	}
	
	/*
	 * Method to sort shapeArray in insertion sort algorithm.
	 * This version of insertionSort() can sort the shape array with height
	 * @param <T> array
	 * 
	 */
	
	public static <T> void insertionSort(Comparable<T> [] array) {

		for (int i = 1; i < array.length; i++) {
			Comparable<T> key = array[i]; //at second index as i (step)= 1 [1]([2])[3]
			int j = i - 1; //at first index [0]            ([1])[2][3]
			while (j >= 0 && key.compareTo((T) array[j]) > 0) { //j is 0 and key(1) is greater than 0
			// For ascending order, change key> arr[j] to key< arr[j].
				array[j + 1] = array[j];
			--j;
			}
			array[j + 1] = key;
			}
	}

	/*
	 * Method to sort shapeArray in insertion sort algorithm.
	 * This version of insertionSort() can sort the shape array with area or volume.
	 * @param <T> array
	 * @param compare class
	 */
	public static <T> void bavinsertionSort(Comparable<T> [] array, Comparator<? super T> compare) {

		for (int i = 1; i < array.length; i++) {
			Comparable<T> key = array[i]; //at second index as i (step)= 1 [1]([2])[3]
			int j = i - 1; //at first index [0]            ([1])[2][3]
			while (j >= 0 && compare.compare((T) key, (T)array[j]) > 0) { //j is 0 and key(1) is greater than 0
		
				array[j + 1] = array[j];
			--j;
			}
			array[j + 1] = key;
			}
	}
	
	/*
	 * Merge sort algorithm to sort shapeArray 
	 * Sort the shape array by height
	 * @param <T> array
	 * 
	 */
	
	
	 
	 public static Comparable[] mergeSortHeight(Comparable[] array) 
	  {
	    //If list is empty; no need to do anything
	        if (array.length <= 1) {
	            return array;
	        }
	         
	        //Split the array in half in two parts
	        Comparable[] first = new Comparable[array.length / 2];
	        
	        Comparable[] second = new Comparable[array.length - first.length];
	        
	        System.arraycopy(array, 0, first, 0, first.length);
	        
	        System.arraycopy(array, first.length, second, 0, second.length);
	        
	         
	        //Sort each half recursively
	        mergeSortHeight(first);
	        mergeSortHeight(second);
	         
	        //Merge both halves together, overwriting to original array
	        merge(first, second, array);
	        return array;
	    }
	     
	  @SuppressWarnings({ "rawtypes", "unchecked" }) 
	    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) 
	  {
	        int firstofFirstArray = 0;
	        int firstofSecondArray = 0; 
	        int Merge = 0;
	         
	     
	        while (firstofFirstArray < first.length && firstofSecondArray < second.length) 
	        {
	            if (first[firstofFirstArray].compareTo(second[firstofSecondArray]) < 0) 
	            {
	                result[Merge] = second[firstofSecondArray];
	                firstofSecondArray++;
	            } 
	            else
	            {
	                result[Merge] = first[firstofFirstArray];
	                firstofFirstArray++;
	            }
	            Merge++;
	        }
	        
	        System.arraycopy(first, firstofFirstArray, result, Merge, first.length - firstofFirstArray);
	        System.arraycopy(second, firstofSecondArray, result, Merge, second.length - firstofSecondArray);
	    }
	  
	  
	  /*
		 * Merge sort algorithm to sort shapeArray 
		 * Sort the shape array by volume and base area
		 * @param <T> array
		 * @param comparee
		 */
	  
	  @SuppressWarnings("unchecked")
	public static <T> Comparable[] mergeSort(Comparable<T>[] array, Comparator< T> comparee) 
	  {
	   
	        if (array.length <= 1) {
	            return array;
	        }
	         
	      
	        Comparable[] first = new Comparable[array.length / 2];
	        Comparable[] second = new Comparable[array.length - first.length];
	        System.arraycopy(array, 0, first, 0, first.length);
	        System.arraycopy(array, first.length, second, 0, second.length);
	         
	       
	        mergeSort(first, comparee);
	        mergeSort(second, comparee);
	         
	       
	        merge2(first, second, array, comparee);
	        return array;
	    }

	  
	

	@SuppressWarnings({ "rawtypes", "unchecked" }) 
	    private static <T> void  merge2(Comparable [] first, Comparable [] second, Comparable [] result, Comparator< T> compare) 
	  {
	      
	        int firstofFirstArray = 0;
	   
	        int firstofSecondArray = 0;
	         
            int Merge = 0;
	         
	    
	       
	      do {
	        
	            if ( compare.compare(  (T) first[firstofFirstArray],  (T) second[firstofSecondArray]) < 0) 
	            {
	                result[Merge] = second[firstofSecondArray];
	                firstofSecondArray++;
	            } 
	            else
	            {
	                result[Merge] = first[firstofFirstArray];
	                firstofFirstArray++;
	            }
	            Merge++;
	      } while (firstofFirstArray < first.length && firstofSecondArray < second.length);
	        
	      
	        System.arraycopy(first, firstofFirstArray, result, Merge, first.length - firstofFirstArray);
	        System.arraycopy(second, firstofSecondArray, result, Merge, second.length - firstofSecondArray);
	    }
	

  
   
	/*
	 * Selection sort algorithm to sort shapeArray 
	 * Sort the shape array by height
	 * @param <T> array
	 * 
	 */
   
   public static void selectionSortHeight(Comparable[] array) { 
	   
	    int k = array.length;
	   
	    for (int i = 0; i < k; i++) { 
	 
	        int maxIndex = i;
	        for (int j = i + 1; j < k; j++)
	        if ( array[j].compareTo(array) > 0 )
	             maxIndex = j;
	 
	        if (maxIndex != i) {
	            Comparable temp = array[i];
	            array[i] = array[maxIndex];
	            array[maxIndex] = temp;
	        }
	    }
}
   /*
	 * Selection sort algorithm to sort shapeArray 
	 * Sort the shape array by volume and base area
	 * @param <T> array
	 * 
	 */
  
   
   public static <T> void selectionSort(Comparable[] array , Comparator<T> comparee) { 
	   
	    int k = array.length;
	    
	    for (int i = 0; i < k; i++) { 
	    	 int maxIndex = i;
	        
	        for (int j = i + 1; j < k; j++)
	        if ( comparee.compare(  (T) array[j],  (T) array[maxIndex]) > 0 )
	             maxIndex = j;
	 
	        if (maxIndex != i) {
	            Comparable temp = array[i];
	            array[i] = array[maxIndex];
	            array[maxIndex] = temp;
	        }
	    }
}
   
}



	








  
	
	
	
	
	
	
	
	
	
	
	

	  
  
      
	
	
	
	
	
	
	
	
	
	
	
	
	

