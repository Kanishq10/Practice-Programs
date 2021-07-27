package practice;

class SolutionA {
    public static void main(String[] args) {
       int n=123;
        while(n!=0)
    {
    res=n/10;
    rem=n%10;
    if(rem==0)
    {
    num=num+count*5;
    }
    else 
    num = num + rem*count;
    
    count = count*10;
    n=n/10;
    }
    }
}
