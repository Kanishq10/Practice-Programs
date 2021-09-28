
class Aheap{     //MaxHeap
    int arr[]=new int[20];
    int size=0;
    void insert(int n){
        arr[size]=n;
        int curr=size;
        size++;
        while(curr!=0){ 
            int pi;     //parent's index
            if(curr%2==0){
                pi=(curr/2)-1;
            }
            else{
                pi=(curr-1)/2;
            }
            if(arr[pi]<arr[curr]){  //if parent is less than child ,swap
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

    void delete(int n){  //verify it online  
        int curr=-1;
        for(int i=0;i<size;i++){
            if(arr[i]==n){
                curr=i;
                break;
            }
        }
        if(curr==-1){
            return;
        }
        //swap
        int temp=arr[size-1];
        arr[size-1]=arr[curr];
        arr[curr]=temp;
        size--;
        int l=curr*2+1;
        int r=curr*2+2;
        //shift down operation
        while((l<size) && (arr[l]>arr[curr] || arr[r]>arr[curr])){
            if(r>=size){ //only left child
                temp=arr[curr];
                arr[curr]=arr[l];
                arr[l]=temp;
                curr=l;
            }
            else{
                if(arr[l]>arr[r]){
                    temp=arr[curr];
                    arr[curr]=arr[l];
                    arr[l]=temp;
                    curr=l;
                }
                else{
                    temp=arr[curr];
                    arr[curr]=arr[r];
                    arr[r]=temp;
                    curr=r;
                }
            }
            l=curr*2+1;
            r=curr*2+2;
        }
    }

    void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class HeapArrayMax{
public static void main(String[] args) {
    Aheap h=new Aheap();
    h.insert(10);
    h.insert(20);
    h.insert(40);
    h.insert(15);
    h.insert(5);
    h.print();
    h.delete(20);
    h.delete(40);
    h.print();
}
}