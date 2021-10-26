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
                System.out.println("here");
                return;
            }
            ptr = ptr.next;
        }
        ptr.next=new GR(index,distance);
    }

    void print(){
        if(root==null){
            return;
        }
        GR ptr=root;
        while(ptr.next!=null){
            System.out.print("<<"+ptr.index+" "+ptr.distance+">> ");
            ptr=ptr.next;
        }
        System.out.println();
    }
}
class GraphArrayList {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String arr[]={"Chandigarh","Mumbai","Delhi","Kolkata","Chennai"};
      GR al[]=new GR[5];//bugs
      for (int i = 0; i < al.length; i++) {
          al[i]=new GR();
      }
      System.out.println("Enter 1 for Directed Graph, 2 for undirected Graph");
      switch (in.nextInt()) {
      case 1:
          char ans = 'y';
          while (ans == 'y' || ans == 'Y') {
              System.out.println("Enter first city ,second city and distance between them");
              String s1 = in.next();
              String s2 = in.next();
              int distance = in.nextInt();
              int i = -1, j = -1;
              for (int x = 0; x < arr.length; x++) {
                  if (arr[x].equalsIgnoreCase(s1)) {
                      i = x;
                  }
              }
              for (int x = 0; x < arr.length; x++) {
                  if (arr[x].equalsIgnoreCase(s2)) {
                      j = x;
                  }
              }
              if (i != -1 && j != -1) {
                  al[i].insert(j, distance);
                  System.out.println("Execute");
              }
              System.out.println("Want to enter more y/n ");
              ans = in.next().charAt(0);
          }
          break;

      case 2:
          ans = 'y';
          while (ans == 'y' || ans == 'Y') {
              System.out.println("Enter first city,second city and distance between them");
              String s1 = in.next();
              String s2 = in.next();
              int distance = in.nextInt();
              int i = -1, j = -1;
              for (int x = 0; x < arr.length; x++) {
                  if (arr[x].equalsIgnoreCase(s1)) {
                      i = x;
                  }
              }
              for (int x = 0; x < arr.length; x++) {
                  if (arr[x].equalsIgnoreCase(s2)) {
                      j = x;
                  }
              }
              if (i != -1 && j != -1) {
                  al[i].insert(j, distance);
                  al[j].insert(i, distance);
                  System.out.println("execute");
              }
              System.out.println("Want to enter more y/n ");
              ans = in.next().charAt(0);
          }
          break;
      default:
          System.out.println("Wrong Choice");
          break;
      }
      al[0].print();
      al[1].print();
      al[2].print();
      al[3].print();
      al[4].print();
      in.close();
    }
}
