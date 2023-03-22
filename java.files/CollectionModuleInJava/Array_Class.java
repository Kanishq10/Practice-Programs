package CollectionModuleInJava;

import java.util.Arrays;

public class Array_Class {
    public static void main(String[] args) {
        int numbers[]={7,2,8,1,3,5,9,12,65,32};
        System.out.println(Arrays.binarySearch(numbers, 3));
        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.fill(numbers, 12);
        for (int i : numbers) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));
    }
}
