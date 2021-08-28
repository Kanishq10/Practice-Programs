class SL{
    int data,priority;
    SL head,next;
    SL(){
        head=null;
    }
    SL(int data){
        this.data=data;
        next=null;        
    }

    void enqueue(int data){
        SL n=new SL(data);
        if (head==null){
            head=n;
        }
        else if(head.data>n.data){
            n.next=head;
            head=n;
        }
        else{
            SL ptr=head;
            while(ptr.next!=null && ptr.next.data<n.data){  //important, write ptr.next!=null first otherwise it will throw error
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
        SL ptr;
        for(ptr=head;ptr!=null;ptr=ptr.next){
            System.out.print(ptr.data+" ");
        }
        System.out.println();
    }
}
class SortedList {
    public static void main(String[] args) {
        SL q=new SL();
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.enqueue(0);
        q.enqueue(9);
        q.enqueue(7);
        q.enqueue(-2);
        q.enqueue(-4);
        q.enqueue(78);
        q.enqueue(16);
        q.enqueue(12);
        q.enqueue(19);
        q.enqueue(20);
        q.enqueue(21);
        q.enqueue(32);
        q.enqueue(25);
        q.print();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.print();
    }    
}
