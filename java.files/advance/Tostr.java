package advance;

public class Tostr{
	int rollno,age;
	String name;
	Tostr(int rollno,int age,String name){
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString(){
		return ("Name: "+this.name+" Rollno: "+this.rollno+" Age: "+this.age);
	}
	public static void main(String[] args) {
		Tostr st=new Tostr(15,18,"kanishq");
		Tostr st1=new Tostr(16,19,"helo");
		System.out.println(st+" "+st1);
	}
	
}