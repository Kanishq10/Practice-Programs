import java.util.Scanner;

class GR{
    int index,distance;
    GR next,root;
    GR(){
        root=null;
        next=null;
    }
    GR(int index,int distance){
        this.distance=distance;
        this.index=index;
    }
    void insert(int index,int distance){
        if(root==null){
            root=new GR(index,distance);
            return;
        }
        GR ptr=root;
        while (ptr.next != null) {
            if (ptr.index == index && ptr.distance == distance) {
                return;
            }
            ptr = ptr.next;
        }
        ptr.next=new GR(index,distance);
    }

    void print(GR root){
        if(root==null){
            return;
        }
        GR ptr=root;
        while(root.next!=null){
            System.out.print("<<"+ptr.index+" "+ptr.distance+">> ");
        }
        System.out.println();
    }
}
class Graph {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String arr[]={"Chandigarh","Mumbai","Delhi","Kolkata","Chennai"};
      GR al[]=new GR[5];
      System.out.println("Enter 1 for Directed Graph, 2 for Directed Graph");
      switch (in.nextInt()) {
      case 1:
          char ans = 'y';
          while (ans == 'y' || ans == 'Y') {
              System.out.println("Enter first city ,second city and distance between them");
              //equal ignore case compare strings
              System.out.println("Want to enter more y/n ");
          }
          break;

      case 2:
          ans = 'y';
          while (ans == 'y' || ans == 'Y') {
              System.out.println("Enter first city index ,second city index and distance between them");
              int i = in.nextInt();
              int j = in.nextInt();
              int distance = in.nextInt();
              al[i].insert(j, distance);
              al[j].insert(i, distance);
              System.out.println("Want to enter more y/n ");
          }
          break;
      default:
          System.out.println("Wrong Choice");
          break;
      }
    }
}
