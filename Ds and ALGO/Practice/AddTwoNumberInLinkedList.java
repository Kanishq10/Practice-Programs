package Practice;

public class AddTwoNumberInLinkedList {
    static Node addListNumbers(Node head1, Node head2) {
        // Write your code here
        Node dummy =new Node(0);
        Node temp=dummy;
        Node l1=head1;
        Node l2=head2;
        int carry=0;
        while(l1!=null || l2!=null || carry==1){
          int sum=0;
          if(l1!=null){
            sum+=l1.data;
            l1=l1.next;
          }
          if(l2!=null){
            sum+=l2.data;
            l2=l2.next;
          }
          sum+=carry;
          Node n= new Node();
          n.data=sum%10;
          carry=sum/10;
          temp.next=n;
          temp=temp.next;
        }
        return dummy.next;
      }
    public static void main(String[] args) {
        
    }
}
