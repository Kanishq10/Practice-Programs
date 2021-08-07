package advance__java;

public class Student2 {
	public static<T extends Comparable<T>> T maximum(T x,T y,T z) {
		T max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if (z.compareTo(max)>0) {
			max =z;
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.printf("Max of %d,%d,%d is %d\n\n",3,4,5,maximum(3, 4, 5));
		System.out.printf("Max of %.1f,%.1f,%.1f is %.1f\n\n",1.3,4.6,2.78,maximum(1.3, 4.6, 2.78));
		System.out.printf("Max of %s,%s,%s is %s\n\n","apple","mango","banana",maximum("apple","mango","banana"));
	}

}
