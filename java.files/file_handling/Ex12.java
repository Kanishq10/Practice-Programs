package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex12 {
    public static void main(String[] args) {
        String src="D://filehandling//output.txt"; 
        try {
            BufferedReader br=new BufferedReader(new FileReader(src));
            String text=null;
            while((text=br.readLine())!=null){
                System.out.println(text);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
