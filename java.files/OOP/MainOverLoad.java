package OOP;

//only function with defined function can run
public class MainOverLoad {
	public static void main(String[] args) {
		System.out.println("MAin with string[]");
	}
	public static void main(String[] arg,int x) {
		System.out.println("It will also not run");
	}
	public static void main(String args) {
		System.out.println("Main with String");
	}
	public static void main() {
		System.out.println("main without args");
	}
}
