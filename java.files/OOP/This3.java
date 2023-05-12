package OOP;
class A1{
A1 getA(){
        return this;
    }
    void msg(){System.out.println("Hello java");}
}
class This3 {
    public static void main(String[] args) {
        System.out.println(new A1().getA());
        new A1().getA().msg();
    }
}
