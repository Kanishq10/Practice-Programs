package file_handling;
import java.io.*;

public class Filehandling {
    public static void main(String[] args) throws IOException {
        FileInputStream in=null;
        FileOutputStream out=null;
        try {
            in=new FileInputStream("D://filehandling//input.txt");
            out=new FileOutputStream("D://filehandling//output.txt");
            int c;
            while((c=in.read())!=-1){
                out.write(c);
                System.out.print((char)c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            if(in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
            }
            
            
            
            String path="D://filehandling//input.txt",path2="D://filehandling//output.txt";
            try(FileInputStream inp=new FileInputStream(path);
                FileOutputStream op=new FileOutputStream(path2)
            ) {
                int x;
                System.out.println("\n");
                while ((x=inp.read())!=-1) {
                    System.out.print((char) x);
                    op.write(x);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            String paths="D://filehandling//output.txt";
            try(BufferedInputStream inp=new BufferedInputStream(new FileInputStream(paths)) ) {
                int x;
                System.out.println("\n");
                while ((x=inp.read())!=-1) {
                    System.out.print((char) x);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
