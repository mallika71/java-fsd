package Searching;

import java.util.Arrays;

public class exponentialsearch{
	public static void main(String[] args) {
		int[] arr = {6,12,18,22,34,56,78};
		int length =arr.length;
		int value=18;
		int result=exponentialSearch(arr,length,value);
		
		if(result<0) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element  found at the index :" + result);

		}
		
	}
	

	private static int exponentialSearch(int[] arr, int length, int value) {
		if(arr[0]==value) {
			return 0;
		}
		int i=1;
		while(i<length && arr[i]<= value) {
			i=i*2;
		}
		return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
	}
}