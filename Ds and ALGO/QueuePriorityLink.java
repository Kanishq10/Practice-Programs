class QPL{
    int data,priority;
    QPL front,rear,next;
    QPL(){
        front=null;
        rear=null;
        next=null;
    }
    QPL(int data,int priority){
        this.data=data;
        this.priority=priority;
        next=null;        
    }


    // void enqueue(int data){
    //     QPL n=new QPL(data,rear.priority+1);
    //     if(front==null && rear==null){
    //         front=n;
    //         rear=front;
    //         return;
    //     }
    //     rear.next=n;
    //     rear=rear.next;
    // }


    void enqueue(int data,int priority){
        QPL n=new QPL(data,priority);
        if(front==null && rear==null){
            front=n;
            rear=front;
            return;
        }
        if(front.priority>priority){
            n.next=front;
            front=n;
        }
        else{
            QPL ptr=front;
            while( ptr.next.priority<=priority && ptr.next!=null){
                ptr=ptr.next;
            }
            if(ptr.next==null){
                ptr.next=n;
                rear=n;
            }
            else{
                n.next=ptr.next;
                ptr.next=n;
            }
        }
    }

    int dequeue(){
        if(front==null && rear==null){
            System.out.println("UnderFlow");
            return -1;
        }
        if(front==rear){
            int x=front.data;
            front=null;
            rear=null;
            return x;
        }
        else{
            int x=front.data;
            front=front.next;
            return x;
        }
    }

    void print(){
        if(front==null && rear==null){
            System.out.println("UnderFlow");
            return;
        }
        QPL ptr;
        for(ptr=front;ptr!=null;ptr=ptr.next){
            System.out.print(ptr.data+" ");
        }
        System.out.println();
    }
}
class QueuePriorityLink {
    public static void main(String[] args) {
        QPL q=new QPL();
        q.enqueue(2,3);
        q.enqueue(3,3);
        q.enqueue(4,3);
        q.enqueue(5,3);
        q.print();
    }   
}
