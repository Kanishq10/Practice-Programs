
class SortingMethods {
    static int[] selectionSort(int[] arr) { // selecting an element and compare to other elements
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

    static int[] bubbleSort(int arr[]) { // bubbling out largest number
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

    static int[] insertionSort(int arr[]) // inserting elements in sorted way prefrable if array is almost sorted ie.for
                                          // best case
    {
        for (int i = 1; i < arr.length; i++) { // shifting larger elements to next position and inserting key element to
                                               // pcorrect location
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    static void mergeSort(int arr[], int low, int high) { // prefered worst case=nlogn
        if (low < high) {
            int mid = low + (high - low) / 2; // this is prefered over (low+high)/2 because low+high may cause overflow
                                              // ie.if it is greater than maxinteger
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) { // part of mergesort
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = low;
        // sorting and merging
        while (i < n1 && j < n2) { // compare and insert
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) { // insert if reamaining
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) { // insert if remaining
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 9, 46, 7, 4, -1, -2, 0, -4, 5 };
        mergeSort(arr, 0, arr.length - 1);
        print(arr);
        int arr1[] = { 3, 5, 1, 2, 9, 6, 5, 4, -1, -2 };
        insertionSort(arr1);
        print(arr1);
    }
}
