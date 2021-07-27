import java.util.Scanner;

class myswitch2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row=s.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}
