import java.util.Scanner;

public class Solution {
    public static char highestOccuringChar(String str) {
		//Your code goes here
        int []list=new int[256];
        for(int i=0;i<256;i++){
            list[i]=0;
        }
        for(int j=0;j<str.length();j++){
            int count=1;
            char temp=str.charAt(j);
            for(int k=0;k<str.length();k++){
                if(str.charAt(k)==temp){
                    count++;
                }
                list[(int)temp]=count;
            }
            
        }
        int max=list[0];
        int maxindex=0;
        for( int i=0;i<256;i++){
            if(list[i]>max){
                max=list[i];
                maxindex=i;
            }
        }
        return (char)maxindex;
        
	}
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        char s=highestOccuringChar(str);
        System.out.println(s);
        obj.close();
    }
}////////////////////////////////make a program highest occurance of chars with rank
