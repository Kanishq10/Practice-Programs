package practice;

import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        System.out.println("No. of digits in this number is: "+((int)Math.log10(x)+1));
        s.close();
    }
}
