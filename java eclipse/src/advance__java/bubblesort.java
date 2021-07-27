package advance__java;

import java.util.*;

public class bubblesort<T extends Comparable<T>> {
	T[] arr;
	public bubblesort(T[] array) {
		arr=array;
	}
	private T[] sorts() {
		for (int i = arr.length; i >1; i--) {
			for(int j=0;j<i-1;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					swapElements(j,arr);
				}
			}
		}
		return arr;
	}
	private void swapElements(int index,T[] arr) {
		T temp=arr[index];
		arr[index]=arr[index+1];
		arr[index+1]=temp;
	}
	public static void main(String[] args) {
		Integer intarr[]= {34,76,13,78,45,32,90,67,43,2,78,4,6,21};
		bubblesort<Integer> bsg1 = new bubblesort<Integer>(intarr);
		Integer sa1[]=bsg1.sorts();
		System.out.println("Sorted array- " + Arrays.toString(sa1));
		String[] strArr = {"Amit", "Kapil", "Asha", "Nikhil","Bhadana,AMIT,kAPIL"};
		bubblesort<String> bsg2 = new bubblesort<>(strArr);
		String[] sa2 = bsg2.sorts();
		System.out.println("Sorted array- " + Arrays.toString(sa2));
	}
}
