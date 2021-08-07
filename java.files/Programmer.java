
class Employees{
	int salary=100;
	void work() {
		System.out.println("work");
	}
}
class Manager extends Employees{
	int extra=1278;
	void manage() {
		System.out.println("Manage");
	}
}
class Dev extends Employees{
	int extra=2090;
	void order() {
		System.out.println("order");
	}
}

class Programmer extends Dev{
	int bonus=1570;
	void debug() {
		System.out.println("debug");
	}
	public static void main(String[] args) {
		Programmer p1 = new Programmer();
		System.out.println(p1.salary);
		System.out.println(p1.bonus);
		p1.work();
		p1.order();
		p1.debug();
		Manager m1=new Manager();
		System.out.println(m1.salary);
		System.out.println(m1.extra);
		m1.work();
		m1.manage();
	}
}
