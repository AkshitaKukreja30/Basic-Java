class demo
{
    int a;
    demo()
    { a=10; }
    void modify(int a)
    {
        a=a+10;
        System.out.println(a);
    }
    void display()
    {
        System.out.print(a);
    }}
public class Callval {
    public static void main(String[] args) {
     demo obj=new demo();
     obj.modify(20);
obj.display();
}    }
