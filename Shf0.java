public class Shf0 {
    public static void main(String[] args) {
        int []a={9,2,0,5,0,8,3,2,0};
        int i,j=0;
        for(i=0;i<a.length;i++)
        {
            
                    if(a[i]!=0)
                    {
                        a[j]=a[i];
                        j++;
                    }
        }
        for(i=j;i<a.length;i++)
        {
            a[i]=0;
        }
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
}   }
    
