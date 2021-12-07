package CollectionModuleInJava;

import java.util.*;

public class operation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            ArrayList<Integer> A = new ArrayList<Integer>();
            int q=s.nextInt();
            while(q>0){
                char c=s.nextLine().charAt(0);
                if(c=='a'){
                    int x=s.nextInt();
                    A.add(x);
                }
                else if(c=='b'){
                    Collections.sort(A);
                }
                else if(c=='c'){
                    Collections.reverse(A);
                }
            }
        }
        s.close();
    }
}
