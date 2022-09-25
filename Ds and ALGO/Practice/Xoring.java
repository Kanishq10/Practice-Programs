package Practice;

public class Xoring {
    //need to correct the program
    public static int findOneMissingEle(int arr1[],int arr2[]){
        int xor1=0;
        for (int i = 0; i < arr1.length; i++) {
            xor1^=arr1[i];
        }

        int xor2=0;
        for (int i = 0; i < arr2.length; i++) {
            xor2^=arr2[i]^i;
        }
        return xor1^xor2;
    }
    public static int findOddFrequencyNumber(int arr[]){
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor^=arr[i];
        }
        return xor;
    }
    public static int findEvenFrequencyNumber(int arr[]){
        int xor=arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor^=arr[i];
        }
        return xor; 
    }
    public static void main(String[] args) {
        System.out.println(10^10);
        System.out.println(10^1);
        System.err.println(1^10);
        System.out.println(2^3);
        System.out.println(5^8);
        System.out.println(0^23);
        System.out.println(0^0);
        System.out.println("----------------------------------------");
        int arr1[]={-1,2,0,4,5,-334};
        int arr2[]={0,2,5,4};
        System.out.println(findOneMissingEle(arr1, arr2));    
        int arr[]={5,2,4,3,4,3,2,5,4,5,5};
        System.out.println(findOddFrequencyNumber(arr));
        int a[]={2,2,2,3,3,3,4,4};
        System.out.println(findEvenFrequencyNumber(a));
    }
}
