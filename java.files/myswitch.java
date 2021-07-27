import java.util.Scanner;

class myswitch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter two numbers\t");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.print("Enter 1 for Addition\nEnter two for subtraction\nEnter 3 for multipication\nEnter 4 for division\t");
        int n=s.nextInt();
        System.out.print("\nThe result is\t");
        switch(n){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            default:
            System.out.println("Invalid operation");
        }
        s.close();
    }
}
