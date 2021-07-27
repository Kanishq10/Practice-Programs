package fun;
import java.io.*;
// This program will show you how to convert mp4 to mp3
public class Filehandling {
    public static void main(String[] args) throws IOException {
        FileInputStream in=null;
        FileOutputStream out=null;
        try {
            in=new FileInputStream("D://filehandling//2021.mp4"); //this file will be converted into mp3 which is downloaded from youtube via python pytube module
            out=new FileOutputStream("D://filehandling//2021_varinder_brar.mp3");//target file of type mp3 it is created with vs code ..
            int c;
            while((c=in.read())!=-1){
                out.write(c); //copy content of old file to new
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
        }
        
    }
}
