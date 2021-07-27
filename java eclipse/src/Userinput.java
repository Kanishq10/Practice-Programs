import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Userinput {
    public static void main(String[] args) throws  IOException {
		System.out.println("Enter Input ");
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		int i=Integer.parseInt(br.readLine());
		System.out.println(i);
		StringBuffer sbf=new StringBuffer("Kanishq");
		System.out.println(sbf);
		System.out.println(sbf.hashCode());
		sbf.append(" Sharam");
  		System.out.println(sbf);
		System.out.println(sbf.hashCode());		
    }
}
