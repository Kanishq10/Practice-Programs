import java.util.Scanner;
 class Sts{
     String f(String S) { //it will only reverse characters in string,digits in string will remain same 
        // YOur code goes here
        StringBuilder x=new StringBuilder();
        int j=S.length()-1;
        for(int i=0;i<S.length();i++){
            if(Character.isLetter(S.charAt(i))){
                while(!Character.isLetter(S.charAt(j)))
                    j--;
                    x.append(S.charAt(j--));
            }
            else{
                x.append(S.charAt(i));
            }
        }
        return x.toString();
    }
}




public class Solution1
{
	public static void main(String[] args) {
		String str;
		int t;
		Scanner obj=new Scanner(System.in);
		t=obj.nextInt();

		while(t>0)
		{
   			str=obj.next();
   			Sts s=new Sts(); 
   			System.out.println(s.f(str)); //design a function f inside class Sts
   			t--;
		}
		obj.close();
	}
}