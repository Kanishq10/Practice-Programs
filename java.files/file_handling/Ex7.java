package file_handling;

import java.io.*;
import java.io.IOException;

 class Ex7 {
    public static void main(String[] args) throws Exception {
        int i;
        FileInputStream fin=null;
        if(args.length!=1){
            System.out.println("Enter Valid filename: ");
            return;
        }
        try {
            fin=new FileInputStream(args[0]);
        } catch (Exception e) {
            System.out.println("file not found");
        }
        try {
            do{
             i=fin.read();
             if(i!=-1) System.out.println((char)i);
             }while(i!=1);
        } catch (Exception e) {
            System.out.println(e);
        }
        try{
            fin.close();
        }catch(IOException e){
            System.out.println("go go go");
        }
    }
}
