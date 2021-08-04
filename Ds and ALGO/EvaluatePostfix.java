import java.util.Scanner;
import java.util.Stack;

class EvaluatePostfix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String exp=s.nextLine();
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c=exp.charAt(i);
            if(Character.isDigit(c)){
                st.push(c-'0');
            }    
            else{
                int a=st.pop();
                int b=st.pop();
                switch(c){
                    case '+':st.push(b+a);
                            break;
                    case '-':st.push(b-a);
                             break;
                    case '*':st.push(b*a);
                             break;
                    case '/':st.push(b/a);
                            break;
                    case '^':st.push((int) Math.pow(b, a));
                            break;
                    case '%':st.push(b%a);
                            break;
                }
            }        
        }
        int answer=st.pop();
        System.out.println(answer);
        s.close();
    }   
}
