import java.util.Scanner;
import java.util.Stack;

class CheckBalancedEquation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Stack<Character> st=new Stack<>();
        String exp=in.nextLine();
        boolean flag=true;
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(c=='{' || c=='[' || c=='('){
                st.push(c);
            }
            else if(c=='}'){
                if(st.isEmpty() || st.peek()!='{'){
                    flag=false;
                    break;
                }
                else{
                    st.pop();
                }
            }
            else if(c==']'){
                if(st.isEmpty() || st.peek()!='['){
                    flag=false;
                    break;
                }
                else{
                    st.pop();
                }
            }
            else if(c==')'){
                if(st.isEmpty() || st.peek()!='('){
                    flag=false;
                    break;
                }
                else{
                    st.pop();
                }
            }
        }
        if(flag==false){
            System.out.println("Not Balanced");
        }
        else{
            System.out.println("Balanced");
        }
        in.close();
    }    
}
