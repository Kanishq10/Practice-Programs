
public class Sortingrecursive {
	public static void main(String[] args) {
		int arr[]= {9,5,6,3,10,18,15,14,2,12,1};
		int pivot=arr[0];
		int i=0,j=arr.length-1;
        for(int x=0;x<arr.length;x++) {
        	while(i<j) {
        		if(arr[i]<pivot && arr[j]>pivot) {
        			int temp=arr[j];
        			arr[j]=arr[i];
        			arr[i]=temp;
        			i++;
        			j--;
        		}
        	}
        }
        for (int l : arr) {
			System.out.print(l+" ");
		}
}
}
