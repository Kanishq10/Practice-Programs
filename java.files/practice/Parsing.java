package practice;

import java.util.Scanner;

class Parsing {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        int product=(Integer.parseInt(a)*Integer.parseInt(b));
        System.out.println((product%2==0)?1:0);
        s.close();
    }
}
