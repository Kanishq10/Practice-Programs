import java.util.Scanner;
class substring {
    public static void printSubstrings(String str){
    for(int start=0;start<=str.length();start++){
        for(int end=start+1;end<=str.length();end++){
        System.out.println(str.substring(start,end));//end index is exclusive 
        }
    }
    }
}
class Sub{
    public static void main(String[] args){ 
            Scanner s=new Scanner(System.in);
            String str = s.nextLine();
            substring.printSubstrings(str); 
            s.close();
    
}
}