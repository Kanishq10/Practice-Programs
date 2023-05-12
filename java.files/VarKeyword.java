// As of Java 10, you can declare local variables with the var keyword instead of specifying their type, provided their type can be inferred from the initial value. 
// Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1); you simply can write
// var harry = new Employee("Harry Hacker", 50000, 1989, 10, 1); 
// This is nice since it avoids the repetition of the type name Employee.

class varKeyword {
    public static void main(String[] args) {
        var a=10;
        var b=32.3;
        var c="Hello";
        System.out.println(a+" "+b+" "+c);
    }
}