import java.util.Scanner;

class FindMiddle {
    // Find mid of Array
    //Constraints :You can't determine the size of array
    //You can't apply any math form
    //Complexity :n
    static void findmid(int arr[]){
        int count1=0,count2=0;
        try {
            int last;
            while(true){
                count1+=1;
                count2=count2+2;
                last=arr[count2];
            }
        } catch (Exception e) {
            System.out.println("Middle Element is "+arr[count1]);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[s.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        findmid(arr);
        s.close();
    }
}
