package Practice;
import java.util.*;
class GetSubsequenceAndSubstring {
    static ArrayList<String> gssequence(String str){
        if(str.length()==0){
            ArrayList<String> x=new ArrayList<>();
            x.add("");
            return x;
        }
        char t=str.charAt(0);
        String sb=str.substring(1);
        ArrayList<String> li=gssequence(sb);
        ArrayList<String> myli=new ArrayList<>();
        for(String f:li){
            myli.add(f);
        }
        for(String f:li){
            myli.add(t+f);
        }
        return myli;
    }

    static ArrayList<String> gssubstring(String str){       //optimise this 
        if(str.length()==0){
            return new ArrayList<String>();
        }
        ArrayList<String> li=gssubstring(str.substring(1));
        ArrayList<String> myli=new ArrayList<>();
        for(int i=1;i<=str.length();i++){
            myli.add(str.substring(0,i));
        }
        for(String si:li){
            myli.add(si);
        }
        return myli;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        ArrayList<String> li=gssequence(str);
        ArrayList<String> myli=gssubstring(str);
        System.out.println(li);
        System.out.println(myli);
        in.close();
    }
}
