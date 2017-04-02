   /* An element is termed as array leader if all the elements to it's right are less than that element.
    This program checks for array leader and print which element is an array leader and which is not.
	*/
import java.util.Scanner;
public class ArrayLeader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,l;
        System.out.print("Enter the size of array");
        n=sc.nextInt();
        int []a=new int[n];
        System.out.print("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
            for(int i=0;i<n;i++)
            {
                l=a[i];
                int j;
                for(j=i+1;j<n;j++)
                {
                    if(l<a[j])
                    {
                       System.out.print(l);
                       System.out.println("is not a leader");
                      break;
                    }
                }
                    if(j==n)
                    {
                        System.out.print(l);
                        System.out.println("is a leader");
                    }
                }
        }

    }
    
