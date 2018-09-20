package fistNonSmallerIndexPackage;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FirstNonSmallerIndex {
	public static void main(String[] args) {		
		//the max size of the array
		final int maxSize = 10000000;
		
		//the interval by which to increase the array for each test loop
		final int intervalSize = 1000000;
		
		for (int j = 10; j <= maxSize; j+=intervalSize) {
			
			//create a random sorted array
			int[] testArray = createRandomSortedArray(j);
			
			//pick a random number from the above sorted array
			int testNum = getRandom(testArray);
			
			//find the starting time
			long startTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
			
			//invoke the reverse search method
			System.out.println("The smallest index where " + testNum + " (a random number) is located is: " + firstNonSmallerIndex(testArray, testNum));
			
			//find the end time.
			long endTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());;
			
			//find the difference between start and end time
			long algTime = endTime - startTime;
			
			//evangelize the algorithm's run time.
			System.out.println("The above algorithm, searching through an array of size " + j + ", took " + algTime + " ms to compute.");
		}
	}
	
	//the below is my function to find the smallest 
	// element of an array containing value
	public static int firstNonSmallerIndex(int[] array, int value) {
		int valueMin = -1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (value <= array[i]) {
				valueMin = i;
			}
		}
		return valueMin;
	}
	
	//the below function comes from the homework assignment
	public static int[] createRandomSortedArray(int size) {
		Random rand = new Random();
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt(size * 3) - size / 4;
		}
		
		Arrays.sort(array);
		
		return array;
	}
	
	//the below function is borrowed code to find a random number from an array
	public static int getRandom(int[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
}
