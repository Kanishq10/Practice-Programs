
public class OverLOAD {
    static int add(int a,int b) {
    	return a+b;
    }
    static int add(int a,int b,int c) {
    	return a+b+c;
    }
    static float add(float a,float b) {
    	return a+b;
    }
    static double add(int a,float b,long c,double d,int e) { //typePromotion it is only when there is no other match found
    	return(a+b+c+d+e);
    }
	public static void main(String[] args) {
		System.out.println(add(2,6));
		System.out.println(add(2,6,4));
		System.out.println(add(12.5f,65.9f));
		System.out.println(add(1,2,4,3.2,'b')); //typePromotion char will be promoted to int 
		
	}

}
