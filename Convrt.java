/* This Prorgam Converts a decimal number into it's equivalent Octal Number.
    It uses recursion to to reduce the complexity and provides a fast conversion */
import java.util.Scanner;
class deciocta
{
    int dec;
    int n;
    deciocta()
    {
        dec=0;n=0;
    }
    int getoct()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        dec=sc.nextInt();
        return dec;
    }
    int i=1;
    void recdec(int a)
    { int temp;
        if(a!=0)
        {
         temp=a%8;
         n=n+i*temp;
         i=i*10;
         recdec(a/8);
        }
    }
     void decrec(int a)
    { int temp,q;
        if(a!=0)
        {
         temp=a%10;
         q=(int)Math.pow(8,i);
         n=n+(q*temp);
         i++;
         recdec(a/10);
        }
    }
    void putdat()
    {System.out.println("Entered number is: "+dec);
    System.out.println("Octal number is: "+n);
    }     
    }   
public class Convrt {
    public static void main(String[] args) {
       deciocta o=new deciocta();
       int p=o.getoct();
       o.recdec(p);
       o.putdat();
    }    
}
