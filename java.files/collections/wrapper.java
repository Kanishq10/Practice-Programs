package collections;

public class wrapper {
    public static void main(String[] args) {
        Integer x=10;
        Double y=15.6;
        Character z='a'; 
        System.out.println(x+""+y+""+z);
        System.out.println(x.intValue());
        System.out.println(y.doubleValue());
        System.out.println(z.charValue());
        String st=x.toString();
        System.out.println(st.getClass().getSimpleName()); //get type of data
        System.out.println(x.compareTo(10));
        Integer n=Integer.parseInt(st);
        System.out.println(n);
    }
}
