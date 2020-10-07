/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise10;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ARUMUGASAMY
 */
public class count {
    public static void main(String args[]) throws FileNotFoundException, IOException{        
        for(int m=0;m<3;m++)
        {
        BufferedReader f= new BufferedReader(new FileReader(args[m]));
        String read;
        int i=1,count=0;
        String s[];
        while((read=f.readLine())!=null)
        {
            count++;
        }
        System.out.print("number of lines in "+(m+1));
        System.out.print("file: "+(count));
        System.out.println("");
        }
    }
}    
    

