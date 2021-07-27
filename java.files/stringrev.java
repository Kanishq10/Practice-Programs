class stringrev {
    String s;
    String r;
    stringrev(String s){
        this.s=s;
    }
    String rev(){
    r="";
    for(int i=s.length()-1;i>=0;i--){
    r+=s.charAt(i);
    }
    return r;
    }
    int words(){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
    int word2(){
        int cont=0;
        String y=s.trim(); //trim is used to remove trailing and leading spaces
        for(int i=0;i<y.length();i++){
            if(y.charAt(i)==' ' && y.charAt(i+1)!=' '){
                cont++;
            }
        }
        return cont+1;
    }
    String palindrome(){
        String f="";
        if(r.equalsIgnoreCase(s)){//it ignores testcases or change words to uppercase or lowercase in constructor
        f="palindrome";
        }
        else{
            f="not palindrome";
        }
        return f;
    }
}
class FBI{
    public static void main(String[] args) {
        stringrev x=new stringrev("madAM");
        String result=x.rev();
        System.out.println(result);
        System.out.println(x.word2());
        System.out.println(x.palindrome());
    }
}
