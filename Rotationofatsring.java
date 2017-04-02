/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotationofatsring;
import java.util.Scanner;
/**
 *
 * @author ABHISHEK KUKREJA
 */
public class Rotationofatsring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
        System.out.print("enter a word");
        String s=sc.nextLine();
        
        int i=0;
        int k=0;
           char ch3=s.charAt(k);

       
            for(k=0;k<=i;)
        {
                    for(i=0;i<s.length();i++)
                    {
for(int j=i+1;j<s.length();j++)
{
            char ch=s.charAt(i);
        char ch2=s.charAt(j);
             ch3=ch;
             ch=ch2;
        System.out.print(ch);
         
    }           System.out.print(ch3);

       k++; 
}            

                    
    }
    
}
}