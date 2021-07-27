package collections;

import java.util.*;

public class stacks {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        st.add("King");
        st.add("queen");
        st.add("jack");
        st.add("batman");
        st.add("helo");
        st.add("wars");
        st.add("hgju");
        System.out.println(st);
        st.push("first");
        st.push("row");
        st.push("col");
        st.push("bol");
        st.push("first");
        st.push("last");
         System.out.println(st);
         st.pop();
         st.pop();
         st.pop();
         st.pop();
         st.pop();
         st.pop();
         System.out.println(st);
         System.out.println(st.empty());
         System.out.println(st.search("queen"));
         System.out.println(st.indexOf("queen"));
         System.out.println(st.search("king"));
         System.out.println(st.contains("batman"));
         int[] arr={10,20,30,40,50,60,70,80,90,100};
         int n=arr.length;
         Stack<Integer> s=tostack(arr,n);
         for(int i=0;i<s.size();i++){
             System.out.print(s.get(i)+" ");
         }
         System.out.println();
         for(int i=0;i<n;i++){
             System.out.print(s.pop()+" ");
         }
         System.out.println();
         Stack<String> sx=new Stack<>();
         sx.addAll(st);
         System.out.println(sx);
         sx.remove(1);
         System.out.println(sx);
        
  }
  static Stack<Integer> tostack(int[] arr,int n){
      Stack<Integer> s=new Stack<>();
      for(int i=0;i<n;i++){
          s.push(arr[i]);
      }
      return s;
  }
}
