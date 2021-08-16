class CAQueue{  //circular queue it will solve the problems that were in single queue made with array
    int arr[]=new int[10];
    int front,rear;
    CAQueue(){
        front=-1;
        rear=-1;
    }

    void enque(int data){
        if((front==0 && rear==arr.length-1) || (rear==front-1)){
            System.out.println("OverFlow");
            return;
        }
        if(front==-1 && rear==-1){
            front=0;
            rear=0;
        }
        else if(rear==arr.length-1){
            rear=0;
        }
        else{
            rear++;
        }
        arr[rear]=data;
    }

    void deque(){
        if(front==-1 && rear==-1){
            System.out.println("UnderFlow");
            return;
        }
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else if(front==arr.length-1){
            front=0;
        }
        else{
            front++;
        }
    }

    void print(){
        if(front==-1 && rear==-1){
            System.out.println("UnderFlow");
            return;
        }
        if(front>rear){
            for(int i=front;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else{
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

class QueueArrayCircular {
    public static void main(String[] args) {
        CAQueue q=new CAQueue();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        q.enque(6);
        q.enque(7);
        q.enque(8);
        q.enque(9);
        q.enque(10);
        q.enque(11);
        q.print();
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        q.print();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.print();
    }
}
