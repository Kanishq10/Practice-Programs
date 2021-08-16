class QLC{  //circular queue
    int data;
    QLC front,rear,next;
    QLC(){
        front=null;
        rear=null;
        next=null;
    }
    QLC(int data){
        this.data=data;
        front=null;
        rear=null;
        next=null;
    }

    void enque(int data){
        QLC n=new QLC(data);
        if(front==null && rear==null){
            front=n;
            rear=front;
            rear.next=front;
        }
        else{
            n.next=front;
            rear.next=n;
            rear=n;
        }
    }

    void dequeue(){
        if(front==null && rear==null){
            System.out.println("UnderFlow");
            return;
        }
        QLC temp=front;
        rear.next=temp.next;
        front=temp.next;
        temp=null;
    }

    void print(){
        if(front==null && rear==null){
            System.out.println("UnderFlow");
            return;
        }
        QLC ptr=front;
        do{
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }while(ptr!=front);
        System.out.println();
    }
}

class QueueCircularLinkedList {
    public static void main(String[] args) {
        QLC q=new QLC();
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
        q.enque(12);
        q.enque(13);
        q.enque(14);
        q.enque(15);
        q.print();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.print();
        q.enque(2);
        q.enque(3);
        q.enque(32);
        q.enque(5);
        q.print();
    }
}
