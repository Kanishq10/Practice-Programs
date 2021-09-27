
class Aheap{
    int arr[]=new int[50];
    int size=0;
    void insert(int n){
        arr[size]=n;
        int curr=size;
        size++;
        while(curr!=0){
            int pi;
            if(curr%2==0){
                pi=(curr/2)-1;
            }
            else{
                pi=(curr-1)/2;
            }
            if(arr[pi]<arr[curr]){
                int temp=arr[curr];
                arr[curr]=arr[pi];
                arr[pi]=temp;
                curr=pi;
            }
            else{
                break;
            }
        }
    }

    void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class HeapArray{
public static void main(String[] args) {
    Aheap h=new Aheap();
    h.insert(10);
    h.insert(20);
    h.insert(40);
    h.insert(15);
    h.insert(5);
    h.print();
}
}