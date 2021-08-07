package advance__java;
interface A{
	void show();
	void hide();
}
interface B{
	void hi();
}
public class CompraterDemo {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(){
	    public void show() {
	    System.out.println("hello");
		}
	    public void hide(){
		System.out.println("hii");
			}
			};
		B b = () -> {System.out.println("hi");};
				a.show();
				a.hide();
				b.hi();
				b.hi();
			}

		}
	
