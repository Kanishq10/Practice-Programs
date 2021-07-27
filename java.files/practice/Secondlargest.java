package practice;

import java.util.Scanner;

class Secondlargest {
    public static void main(String[] args) {
        // program to print second largest of three numbers
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println("Second largest is: ");
        if(a>b){
            if(b>c){
                System.out.println(b);
            }
            else{
                if(c>a){
                    System.out.println(a);
                }
                else{
                    System.out.println(c);
                }
            }
        }
        else{
            if(a>c){
                System.out.println(a);
            }
            else{
                if(c>b){
                    System.out.println(b);
                }
                else{
                    System.out.println(c);
                }
            }
        }
    
        s.close();
    }

}
