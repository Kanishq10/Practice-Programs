class QPL{
    int data,priority;
    QPL head,next;
    QPL(){
        head=null;
    }
    QPL(int data,int priority){
        this.data=data;
        this.priority=priority;
        next=null;        
    }

    void enqueue(int data,int priority){
        QPL n=new QPL(data,priority);
        if (head==null){
            head=n;
        }
        else if(head.priority>n.priority){
            n.next=head;
            head=n;
        }
        else{
            QPL ptr=head;
            while(ptr.next!=null && ptr.next.priority<=n.priority){  //important, write ptr.next!=null first otherwise it will throw error
                ptr=ptr.next;
            }
            n.next=ptr.next;
            ptr.next=n;
        }
    }
    
    void dequeue(){
        if(head==null){
            return;
        }
        else if(head.next==null){
            head=null;
        }
        else{
            head=head.next;
        }
    }

    void print(){
        if(head==null){
            return;
        }
        QPL ptr;
        for(ptr=head;ptr!=null;ptr=ptr.next){
            System.out.print(ptr.data+" ");
        }
        System.out.println();
    }
}
class QueuePriorityLink {
    public static void main(String[] args) {
        QPL q=new QPL();
        q.enqueue(2,3);
        q.enqueue(3,2);
        q.enqueue(4,6);
        q.enqueue(5,4);
        q.enqueue(9, 100);
        q.enqueue(10, -1);
        q.enqueue(67, 6);
        q.print();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.print();
    }   
}
