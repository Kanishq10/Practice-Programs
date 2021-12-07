import java.util.Scanner;
class payroll {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name=s.next();
        int hour=s.nextInt();
        float rate=s.nextFloat();
        // double tax=0.2, taxs=00.9;
        System.out.println(name+" "+hour+" "+rate+" "+7*hour*rate*0.2+" "+7*hour*rate*00.9);
        s.close();
    }
}
