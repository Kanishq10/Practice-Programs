 class math {
    static  int pi=3;
    final int x;//it can be intialised only in constructor or by value and once it is initialised it cannot modified
    math(int x){
        this.x=x;
    }
    static final int data;//it can only initialised in static block or itself
    static{data=675;}
    static void run(){
        ++pi;
    }
 }
class math2{
    public static void main(String[] args) {
        math obj=new math(65);
        System.out.println(obj.x);
        math.pi=5;
        System.out.println(math.pi);
        System.out.println(obj.pi);
        obj.pi=10;
        math.run();
        System.out.println(obj.pi);
        obj.run();
        System.out.println(math.pi);
        System.out.println(math.data);
        
    }
} 