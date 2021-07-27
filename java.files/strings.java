import java.util.Scanner;
class strings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String city1=s.nextLine();
        String city2=s.nextLine();
        if(city1.compareTo(city2)<0){
            System.out.println("the cities are already in alphabetical order "+city1+" "+city2);
        }
        else if(city1.compareTo(city2)==0){
            System.out.println("both cities are same");
        }
        else{
            System.out.println("alphabetical order is "+city2+" "+city1);
        }
        s.close();
    }
}
