
class SortingMethods {
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    static int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,6,2,9,46,7,4,-1,-2,0,-4};
        bubbleSort(arr);
        print(arr);
    }
}
