class SecondThirdinArray {
    //this method is useful for finding second and third max min in array
    
    public static void main(String[] args) {
        int arr[]={1,3,7,3,9,2,78,45,92,67,77,83};
        int max=arr[0],min=arr[0];
        System.out.print("The Array is ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : arr) {
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println("Min is "+min+" Max is "+max);
        int secondmax=min;
        int secondmin=max;
        for (int i : arr) {
            if(i!=max && i>secondmax){
                secondmax=i;
            }
            if(i!=min && i<secondmin){
                secondmin=i;
            }
        }
        System.out.println("SecondMin is "+secondmin +" Secondmax is "+secondmax);
        int thirdmax=Integer.MIN_VALUE; //or thirdmax=min
        int thirdmin=Integer.MAX_VALUE;//or thirdmin=max
        for (int i : arr) {
            if(i!=max && i!=secondmax && i>thirdmax){
                thirdmax=i;
            }
            if(i!=min && i!=secondmin && i<thirdmin){
                thirdmin=i;
            }
        }
        System.out.println("thirdMin is "+thirdmin +" thirdmax is "+thirdmax);
    }
}
