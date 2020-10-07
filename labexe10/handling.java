/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise10;
import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

/**
 *
 * @author ARUMUGASAMY
 */
public class handling {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the file name");
        String s=obj.next();
        File fi = new File("C:\\Users\\hp.pc\\Documents");
        if(fi.exists())
        {
            System.out.println("File is available");           
            System.out.println("readability of File:"+(fi.canRead()));
            System.out.println("writability of file:"+(fi.canWrite()));
            if((fi.canRead()==true) && (fi.canWrite()==true))
            {
                System.out.println("File is readable and writable");
                
            }            
            if(s.endsWith(".txt"))
            {
                System.out.println(" The given File type is character file");
                
            }
            else if(s.endsWith(".jpeg"))
            {
                System.out.println(" The given File is binary file");
            }
        
            System.out.println("length of the file in bytes"+(fi.length()));
        }
        else
        {
            System.out.println("File is not available");
        }
                  
        
    }
}
    

