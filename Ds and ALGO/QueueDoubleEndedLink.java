import java.util.Scanner;

class QDEL{
    int data;
    QDEL left,right,next,prev;
    QDEL(){
        left=null;
        right=null;
        next=null;
        prev=null;
    }
    QDEL(int data){
        this.data=data;
        left=null;
        right=null;
        next=null;
        prev=null;
    }

    void insertLeft(int data){
        QDEL n=new QDEL(data);
        if(left==null && right==null){
            left=n;
            right=left;
            return;
        }
        n.next=left;
        left.prev=n;
        left=left.prev;        
    }

    void insertRight(int data){
        QDEL n=new QDEL(data);
        if(left==null && right==null){
            left=n;
            right=left;
            return;
        }
        n.prev=right;
        right.next=n;
        right=right.next;
    }

    void delLeft(){
        if(left==null && right==null){
            System.out.println("underFlow");
            return;
        }
        if(left==right){
            left=null;
            right=null;
        }
        else{
            QDEL temp=left;
            temp.next.prev=null;
            left=temp.next;
            temp=null;
        }
    }

    void delRight(){
        if(left==null && right==null){
            System.out.println("underFlow");
            return;
        }
        if(left==right){
            left=null;
            right=null;
        }
        else{
            QDEL temp=right;
            temp.prev.next=null;
            right=temp.prev;
            temp=null;
        }
    }

    void print(){
        if(left==null || right==null){
            System.out.println("No element in list");
        }
        else{
            QDEL ptr=left;
            while(ptr!=null){
                System.out.print(ptr.data+" ");
                ptr=ptr.next;
            }
        }
        System.out.println();
    }
}
class QueueDoubleEndedLink {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        QDEL q=new QDEL();
        System.out.println("Enter 1 for input restricted or Enter 0 for output restricted"); 
        int inp=in.nextInt();     
        switch(inp){
            case 1:
            System.out.println("Enter l for left insertion and r for right insertion");
            char ch=in.next().charAt(0);
            char more;
            do{
                if(ch=='l'){
                    q.insertLeft(in.nextInt());
                }
                else{
                    q.insertRight(in.nextInt());
                }
                System.out.println("Want to enter more, y/n");
                more=in.next().charAt(0);
            }while(more=='y');
            System.out.print("\nThe queue is=> ");
            q.print(); 
            System.out.println("Want to delete y/n");
            ch=in.next().charAt(0);
            if(ch=='y'){
                System.out.println("Enter l for left deletion, r for right deletion");
                ch=in.next().charAt(0);
                while(ch=='l' || ch=='r'){
                    if(ch=='l'){
                        q.delLeft();
                    }
                    else{
                        q.delRight();
                    }
                    System.out.println("Enter l or r for further deletion");
                    ch=in.next().charAt(0);
                }
                System.out.print("\nQueue after deletion=> ");
                q.print(); 
            }
            break;

            case 0:
             System.out.println("Enter l for left insertion,r for right insertion");
             ch=in.next().charAt(0);
             while(ch=='l' || ch=='r'){
                 if(ch=='l'){
                     q.insertLeft(in.nextInt());
                 }
                 else{
                     q.insertRight(in.nextInt());
                 }
                 System.out.println("Enter l or r for further insertion");
                 ch=in.next().charAt(0);
             }
             System.out.print("\nThe queue is=> ");
             q.print();
             System.out.println("Want to delete y/n");
             ch=in.next().charAt(0);
             if(ch=='y'){
                 System.out.println("Enter l for left deletion r for right deletion");
                 ch=in.next().charAt(0);
                 do{
                     if(ch=='l'){
                         q.delLeft();
                     }
                     else{
                         q.delRight();
                     }
                     System.out.println("want to delete more y/n");
                     more=in.next().charAt(0);
                 }while(more=='y');
                 System.out.println("\nQueue after deletion=> ");
                 q.print();
             }
             break;

             default:System.out.println("wrong choice");
        }
        in.close();  
    }    
}
