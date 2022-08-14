package Practice;
import java.util.*;

// Given a string S consisting of uppercase and lowercase characters.
//  The task is to sort uppercase and lowercase letters separately such that 
//  if the ith place in the original string had an Uppercase character then 
//  it should not have a lowercase character after being sorted and vice versa.
public class SortString {
    public static String caseSort(String str)
    {
        // Your code here
        ArrayList<Character> low=new ArrayList<>();
        ArrayList<Character> high=new ArrayList<>();
        String ans=new String("");
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                high.add(str.charAt(i));
            }
            else{
                low.add(str.charAt(i));
            }
        }
        Collections.sort(high);
        Collections.sort(low);
        int h=0,l=0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                ans+=high.get(h)+"";
                h++;
            }
            else{
                ans+=low.get(l)+"";
                l++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(caseSort("HeLloA"));
    }
}
