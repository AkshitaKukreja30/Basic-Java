class demo
{
    int a;
    demo()
    {
        a=10;
    }
    void modify(demo d)
    {
        d.a=d.a+10;
    
    System.out.println(d.a);
}
    void display()
    {
        System.out.print(a);
    }
}
public class Callref {
    public static void main(String[] args) {
    demo obj=new demo();
obj.modify(obj);
obj.display();
    }
    }
