/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise12;
import java.util.Scanner;
/**
 *
 * @author ARUMUGASAMY
 */
public class otm {
    public static void main(String[]args){
        
        Integer num[]={1,2,3,4,5,6};
        od<Integer>obj1=new od<>(num);
        obj1.display();
        Integer n[]={84,2,635,100,9,56,1000,32};
        m<Integer>obj2=new m<>(num);
        obj2.display();
        
        
    }
    
}
class od<T >
{
    T[] value1;
    
    public od(T[] value1)
    {
        this.value1=value1;
        
    }
    int c=0;
    public void display()
    {
    for(int i=0; i<value1.length;i++)
    {
        int w =Integer.parseInt(""+ value1[i]);
        if(w%2!=0)
        {
            c++;
            
        }
            
    }
    System.out.println("number of odd numbers" + c);
    }
    
}
class s<T,D>
{
    Scanner obj= new Scanner(System.in);
    T[] value;
    D v;
    public s(T[] value,D v)
            
    {
        this.value=value;
        this.v=v;
    }
    public void display()
    {
        int p=0,p1=0;
        System.out.println("position starts from 0 ");
        System.out.println("enter two positions");
        int m = obj.nextInt();
        int n=obj.nextInt();
        System.out.println("before swapping");
        for(int i=0;i<value.length;i++)
        {
        System.out.println(value[i]);
        }
        for(int i=0;i<value.length;i++)
        {
            if(i==m)
            {
                 p = 1;
            }
            else if(i==n)
            {
                p1=n;
                
            }
        }
        
            v = (D) value[p];
            value[p]=value[p1];
            value[p1]=(T) v;
            
            
        
        System.out.println("---------");
        System.out.println("after swapping");
        System.out.println("elements of positions " + m + " and " + n + " are swapped ");
        for(int i=0;i<value.length;i++)
        {
            System.out.println(value[i]);
        }
    }
}
class m<T >
{
    T[] value;
    
    public m(T[] value)
    {
        this.value=value;
        
    }

    public void display()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the range");
        System.out.println("Beginning limit:");
        int b=obj.nextInt();
        System.out.println("Ending limit:");
        int e=obj.nextInt();
        int max=0;
        
        for(b=0;b<e;b++)
            {
                int w =Integer.parseInt(""+ value[b]);
                if(w>max)
                {
                    max=w;
                }
            }
             
        
        System.out.println("Maximum number in the range"+max);
    }

}

    
