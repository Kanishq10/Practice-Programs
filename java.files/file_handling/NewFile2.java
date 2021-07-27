package file_handling;

import java.io.File;
import java.io.IOException;

class NewFile2 {
    public static void main(String[] args) {
        try{
        File f=new File("D://filehandling"); 
        System.out.println("File exists=>"+f.exists());
        System.out.println("File Name=>"+f.getName());
        System.out.println("The file has length=>"+f.length()+" bytes");
        System.out.println("Can it be read=>"+f.canRead());
        System.out.println("Can it be write=>"+f.canWrite());
        System.out.println("Can it be execute=>"+f.canExecute());
        System.out.println("Is it a directory=>"+f.isDirectory());
        System.out.println("Is it a file=>"+f.isFile());
        System.out.println("Is it hidden=>"+f.isHidden());
        System.out.println("Is path Absolute=>"+f.isAbsolute());
        System.out.println("Absolute path is=>"+f.getAbsolutePath());
        System.out.println("Canonical path is=>"+f.getCanonicalPath());
        System.out.println("Last modified on "+ new java.util.Date(f.lastModified()));
        System.out.println("Get path=>"+f.getPath());
        System.out.println("Get total Space=>"+f.getTotalSpace());
        System.out.println("Get Usable Space=>"+f.getUsableSpace());
        System.out.println("Get free Space=>"+f.getFreeSpace());
        System.out.println("Parent name=>"+f.getParent());
        System.out.println("Parent file=>"+f.getParentFile());
        String arr[]=f.list();
        for (String string : arr) {
            System.out.print(string+"  ");
        }        
      //  f.mkdirs();//creates a directory or folder
        // f.delete(); delete folders or files
    }catch(IOException e){
        System.out.println(e);
    }    
}
}
