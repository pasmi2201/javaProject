class parent
{
    void get()
    {
        System.out.println("sakura haruno");
    }
}
class child extends parent
{
    void display()
    {
        get();
    }
}
class child2 extends child{
    void print()
    {
        display();
    }
}
public class Multilevel
{
    public static void main(String args[])
    {
        child2 obj=new child2();
        obj.print();
    }
}