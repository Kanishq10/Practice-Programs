
  public class new3{
    int x=6;
    // public static void main(String args[]){
        // Scanner obj=new Scanner(System.in);
        // String a=obj.next();
        // int b=obj.nextInt();
        // int c=obj.nextInt();
        // int d=obj.nextInt();
        // obj.close();
        // System.out.println(a);
        // System.out.println(b+c+d);
    
}
 class hello{
  public static void main(String[] args) {
    new3 f=new new3();
    System.out.println(f.x);
    int a=19,b=19;
    System.out.println(System.identityHashCode(a)+" "+System.identityHashCode(b));
    a=300;b=300;
    System.out.println(System.identityHashCode(a)+" "+System.identityHashCode(b));
  }
}
