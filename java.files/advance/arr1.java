package advance;
import java.util.*;

public class arr1 {

    public static void main(String[] args) {
        // Compare two arrays of type integer which are equal
        int[] a1 = { 1, 2, 3 };
        int[] a2 = { 1, 2, 3 };
        boolean equal = Arrays.equals(a1, a2);
        if (equal) {
            System.out.println("Arrays a1 and a2 are equal with Result😀 : " + equal);    
        }else {
            System.out.println("Arrays a1 and a2 are not equal with Result😀 : " + equal);
        }
    
}

}
