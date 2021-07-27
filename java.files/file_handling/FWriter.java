package file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

class FWriter {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("D://filehandling//output.txt",true);//true for appending data in file
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter out =new PrintWriter(bw);
        ){
            out.println("====😕 🙁 ☹️ yup! yup! yup!");//write data in fie
            out.println("===😛 😝 😜 🤪😛 😝 😜 🤪===");//write data in file
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
