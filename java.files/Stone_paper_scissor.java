import java.util.Scanner;
import java.lang.Math;
public class Stone_paper_scissor {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 1 for Stone\nEnter 2 for Paper\nEnter 3 for Scissor");
        int a=obj.nextInt();
        int b=(int)((Math.random()*3)+1);
        obj.close();
        switch(a){
            case 1:if(b==3){
                System.out.println("stone vs scissor\n You win");
            }
            else if(b==2){
                System.out.println("stone vs paper\n You Lose");
            }
            else{
                System.out.println("stone vs stone\n Tied");
            }
            break;
            case 2:if(b==3){
                System.out.println("paper vs scissor\n You lose");

            }
            else if(b==2){
                System.out.println("paper vs paper\n Tied");
            }
            else{
                System.out.println("paper vs stone\n You win");
            }
            break;
            case 3:if(b==3){
                System.out.println("scissor vs scissor\n Tied");
            }
            else if(b==2){
                System.out.println("scissor vs paper\n You Win");
            }
            else{
                System.out.println("stone vs stone\n Lose");
            }
            break;
        }


    }
}
