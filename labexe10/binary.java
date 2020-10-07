/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise10;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author ARUMUGASAMY
 */
public class binary {
    public static void main(String[] args) throws Exception {
        FileReader fa=null;
        FileWriter fi=null;
        fa=new FileReader("animal.jpg");
        fi=new FileWriter("birds.jpg");
        int i;
        while((i=fa.read())!= -1)
        fi.write(i);
        FileInputStream f =null;
        FileOutputStream fo =null;
        f=new FileInputStream("animal.jpg");
        fo=new FileOutputStream("birds.jpg");
        int j;
        while((j=f.read())!=-1)
        {
            fo.write(j);
        }
        fa.close();
        fi.close();
    }
    
}

    

