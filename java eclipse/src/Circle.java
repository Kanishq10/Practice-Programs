class Operation{
	int sq(int n){
		return n*n;
	}
}
class Circle {
	Operation op;
	int radius;
	double pi=3.14;
	void get(int radius) {
		this.radius=radius;
	}
	double area() {
		op=new Operation();
		int sqar=op.sq(radius);
		double ar=sqar*pi;
		return ar;
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.get(16);
		System.out.println(c.area());
	}

}
