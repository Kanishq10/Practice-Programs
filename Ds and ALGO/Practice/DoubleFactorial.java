package Practice;

class DoubleFactorial {
    static long doublefactorial(long n){
        if(n<3)
            return n;
        else
            return n*doublefactorial(n-2);
    }
    public static void main(String[] args) {
        System.out.println(doublefactorial(4));
    }
}
