class node{
    int info;
    node next,ptr,start=null,n;
    node(){
        this.next=null;
    }    
    node(int info){
        this.info=info;
        this.next=null;
    }    
    
    void add(int info){
        n=new node(info);
        if(start==null){
            start=n;            
        }
        else{
            ptr=start;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=n; // !!important :how it is reflected to start : since ptr has a referance of start so any changes in ptr reflects to start .
        }
    }


    void push(int info){
        n=new node(info);
        if(start==null){
            start=n;
        }
        else{
            n.next=start;
            start=n;
        }
    }
    
    void add(int info,int index){
        n=new node(info);
        if(start==null){
            start=n;
        }
        else if(index==0){
            push(info);
        }        
        else{            
            ptr=start;
            int count=1;
            while(count<index && ptr!=null){
                ptr=ptr.next;
                count++;
            }
            if(ptr==null || ptr.next==null){
                add(info);
            }
            else{
                n.next=ptr.next;
                ptr.next=n;
            }
        }
    }

    void after(int element,int info){
        n=new node(info);
        ptr=start;
        while(ptr.info!=element && ptr!=null){
            ptr=ptr.next;
        }
        if(ptr!=null){
            n.next=ptr.next;
            ptr.next=n;
        }
    }

    void before(int element,int info){
        n=new node(info);
        ptr=start;
        node preptr=new node();
        while(ptr.info!=element && ptr!=null){
            preptr=ptr;
            ptr=ptr.next;
        }      
        if(ptr!=null){
            n.next=ptr;
            preptr.next=n; //it is reflected to ptr then to start
        }  
    }
    node pop(){ //deleting at beggining
        if(start==null){
            System.out.println("Underflow");
            return null;
        }
        node temp=start;
        start=start.next;//refrence or address changed
        temp.next=null; //it is not reflected to start as start has new address
        return temp;
    }
    void delete(){
        if(start==null){
            System.out.println("Underflow");
        }
        else if(start.next==null){
            start=null;
        }
        else{
            node ptr=start;
            while(ptr.next.next!=null){
                ptr=ptr.next;
            }
            ptr.next=null;
        }
    }

    void delete(int pos){
        if(pos==1){
            pop();
        }
        else{
            ptr=start;
            int count=1;
            while(count<pos-1 && ptr.next!=null){ //one place before node that has to be deleted
                ptr=ptr.next;
                count++;
            }
            
            if(ptr.next!=null){
                node x=ptr.next;
                ptr.next=x.next;
                x=null;                
            }
            else{
                System.out.println("Overflow");
            }
        }
    }
    int mid(){
        node t=start;
        node r=start;
        while(r!=null && r.next!=null){ //or while(r.next!=null && r.next.next!=null) First is appropriate
            t=t.next;
            r=r.next.next;
        }
        return t.info;
    }


    int get(int index){
        ptr=start;
        if(ptr==null){
            System.out.print("Empty List=> ");
            return -1;
        }
        else{
            int count=1;
            while(count<=index && ptr!=null){ //for position ie. start index=1  count<index
                ptr=ptr.next;
                count++;
            }
            if(ptr==null){
                System.out.print("Overflow=> ");
                return -1;
            }
    }
    return ptr.info;
    }
    
    int nthLast(int n){
        if(start==null){
            System.out.print("Empty List=> ");
            return -1;
        }
        else{
            int count=1;
            node t=start;//turtule rabbit approach
            node r=start; 
            while(count<=n && r!=null){ //traversing r to nth pos
                r=r.next;
                count++;
            }
            if(r==null){
                System.out.print("Overflow=> ");
                return -1;
            }
            else{
                while(r.next!=null){ //traversing to last position from nth position
                    t=t.next; //traversing to nth last
                    r=r.next;
                }
            }
            return t.info;
        }
    }
    
    void trimSorted(){ //only applies to sorted Linked list
        if(start==null){
            System.out.println("Underflow");
        }
        else{
            ptr=start;
            node x;
            while(ptr.next!=null){
                if(ptr.info==ptr.next.info){
                    x=ptr.next;
                    ptr.next=x.next;
                    x=null;
                }
                else{
                    ptr=ptr.next;
                }
            }
        }
    }
    void print_Even_Odd(){
        if(start==null){
            System.out.println("UnderFlow");
        }
        else{
            ptr=start;
            node even=null;
            node odd=null;
            while(ptr!=null){
                node x=ptr;
                
                if(x.info%2==0){
                    if(even==null){
                        even=x;
                    }
                    else{
                        even.next=x;
                        x.next=null;
                    }
                }
                else{ //insert a
                    if(odd==null){
                        odd=x;
                    }
                    else{
                        odd.next=x;
                        x.next=null;
                    }
                }
                ptr=ptr.next;
            }
            if(even!=null){
               while(even!=null){ //make a printnode function
                   System.out.print(even.info+" ");
                   even=even.next;
               }
               System.out.println();
           }

           if(odd!=null){
            while(odd!=null){
                System.out.print(odd.info+" ");
                odd=odd.next;
            }
            System.out.println();
           }
            
        }
    }
    
        node swap(int x,int y){
        node head=start;
        ptr=head;
        node preptr=null;
        while(ptr!=null && ptr.info!=x){
            preptr=ptr;
            ptr=ptr.next;
        }
        node ptrX=ptr;
        node preptrX=preptr;
        ptr=head;
        preptr=head;
        while(ptr!=null && ptr.info!=y){
            preptr=ptr;
            ptr=ptr.next;
        }
        node ptrY=ptr;
        node preptrY=preptr;

        node temp=ptrY.next;
        ptrY.next=ptrX.next;
        ptrX.next=temp;
        if(preptrX==null){
            head=ptrY;
            preptrY.next=ptrX;
        }
        if(preptrY==null){
            head=ptrX;
            preptrX.next=ptrY;
        }
        if(preptrX!=null && preptrY!=null){
            preptrX.next=ptrY;
            preptrY.next=ptrX;
        }
        return head;
    }   


    void print(){
        if(start==null){
            System.out.println("No element in list");
        }
        else{
            ptr=start;
            while(ptr!=null){
                System.out.print(ptr.info+" ");
                ptr=ptr.next;
            }
        }
        System.out.println();
    }

}
class SingleLinkedList{
    public static void main(String[] args) {
        node x=new node();
        x.add(15);
        x.add(12);
        x.add(17);
        x.add(16);
        x.push(7);
        x.push(6);
        x.push(3);
        x.push(1);
        x.print();
        x.add(13,4);
        x.add(64,16);
        x.add(34,1);
        x.print();
        x.before(17, 156);
        x.before(7, 214);
        x.after(3, 23);
        x.after(3,10);
        x.print();
        x.pop();
        x.pop();
        x.pop();
        x.print();
        x.delete(6);
        x.delete(100);
        x.delete(3);
        x.delete(12);
        x.print();
        x.delete();
        x.delete();
        x.delete();
        x.add(34);
        x.print();  
        System.out.println(x.mid());  
        System.out.println(x.get(0));
        System.out.println(x.get(1)); 
        System.out.println(x.get(2));
        System.out.println(x.get(100));
        System.out.println(x.nthLast(5));
        System.out.println(x.nthLast(0));
        System.out.println(x.nthLast(50));
        node sorted=new node();
        sorted.add(1);
        sorted.add(2);
        sorted.add(2);
        sorted.add(2);
        sorted.add(3);
        sorted.add(3);
        sorted.add(4);
        sorted.add(4);
        sorted.add(4);
        sorted.add(4);
        sorted.add(5);
        sorted.add(5);
        sorted.add(6);
        sorted.add(6);
        sorted.add(7);
        sorted.add(7);
        sorted.add(8);
        sorted.add(9);
        sorted.add(9);
        sorted.print();
        sorted.trimSorted();
        sorted.print();
        x.print();
        x.add(1,0);
        x.add(2,1);
        x.add(5,67);
        x.print();
        node y=new node();
        y.add(1);
        y.add(2);
        y.add(3);
        y.print();
        y.add(34,1);
        y.print();
        y.print_Even_Odd();
    }
}