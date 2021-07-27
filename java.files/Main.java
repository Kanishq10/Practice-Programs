import java.util.Scanner;

class helod{
    public static void main(String args[]) {
        try {
          Scanner s=new Scanner(System.in);
          int a=s.nextInt();
          System.out.println("a = " + a);
          int b = 42 / a;
          System.out.println(b);
          int c[] = { 10 };
          c[42] = 99;
          s.close();
        } catch(ArithmeticException e) {
          System.out.println("Divide by 0: " + e);
        } catch(ArrayIndexOutOfBoundsException e) {
          System.out.println("Array index oob: " + e);
        }
        System.out.println("After try/catch blocks.");
        
      }
}
