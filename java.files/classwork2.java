 class ai {
     int i;

    ai(){
        System.out.println("this a");
    }
    ai(int x){
        System.out.println("this int a");
    }
    int show(){
        i=1;
        System.out.println("hello");
        return(i);
    }
}
class bi extends ai
{
    int a;
    bi(){
        System.out.println("this b");
            }
    bi(int l){
        super(l);          //super method to call constructor of super class //by default it is in it
        System.out.println("this int b");
    }
    int show(){
       a=2;
       System.out.println("hello2");
       return(a);
    }
}
class tri extends bi{
 int z;
 tri(){
     super(3);
     System.out.println("this tri");
 }
    int show(){
    
      z=8;return(z);
}
 void hello(){
     super.show();
 }
}

 class classwork2{
    public static void main(String[] args) {
        bi obj=new bi();
        bi obj2=new bi(4);
        tri t=new tri();
        System.out.println(obj.show());

        System.out.println(obj2.show());
        System.out.println(t.show());
        t.hello();
    }
}
