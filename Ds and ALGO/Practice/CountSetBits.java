package Practice;

//can be used for finding no of operations to divide in factor of 2 to powe ,split w=x+y; by decreasing -1 from ans,codechef question split n starters 51 div 4
public class CountSetBits {
    static int countSetBit(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(countSetBit(n));
    }
}
