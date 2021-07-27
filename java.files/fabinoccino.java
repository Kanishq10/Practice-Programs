 class Fibonacci {

    public static void main(String args[]){

        int n = 11, a = 0, b = 1;

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a + "  ");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
