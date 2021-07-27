/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
 class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner obj=new Scanner(System.in);
		double a=obj.nextDouble();
		double b=obj.nextDouble();
		
		if(b>(a+0.5)){
		    if(a%5==0){
                System.out.println(b-(a+0.5));
		    }
		}
		else{
		    System.out.println(b);
		}
        obj.close();
	}
}
