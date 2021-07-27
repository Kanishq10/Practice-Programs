package file_handling;

import java.io.File;
import java.io.IOException;
class NewFile {
    public static void main(String[] args) {
        try{
        File myObj=new File("D://filehandling//notexecute.txt");
        if(myObj.createNewFile()){
            System.out.println("File Created: "+myObj.getName());
        }else{
            System.out.println("File already exists");
        }
        myObj.mkdir();//creates new directory
    }catch(IOException e){
        System.out.println(e);
    }
    }
}
