

class classwork {
    static int add(int m,int n){
        return(m+n);
    }
    static int sub(int m,int n){
        return(m-n);
    }
    static int mult(int m,int n){
        return(m*n);
    }
    static double div(int m,int n){
       return(m/n);
     }

    public static void main(String[] args) {
        int x=50;
        int y=5;
        System.out.println(add(x,y));
        System.out.println(sub(x,y));
        System.out.println(mult(x,y));
        System.out.println(div(x,y));


    }
}
