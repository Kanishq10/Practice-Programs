public class constructor {
    int a,b;
    protected int g=6;
    String no;
    constructor(int x, int y){
        a=x;
        b=y;
    }
    constructor(int z){
        Boolean flag=true;
       
        for(int i=2;i<=z/2;i++){
            if(z%i==0){
               flag=false;
            }
        }
        if(flag==true){
            no="prime";
        }
        else{
            no="not prime";
        }
    }
    void show(){
    
        System.out.println(no);}

}

class MAIN{
    public static void main(String[] args) {
        // constructor s=new constructor(2,3);
        constructor s1 =new constructor(7);
        // System.out.println(s.a+" "+s.b);
        System.out.println(s1.g);
        s1.show();
    }
}