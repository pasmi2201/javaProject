class parent
{
    void get()
    {
        System.out.println("Itachi Uchiha");
    }
}
class child1 extends parent
{
    void display()
    {
        get();
    }
}
class child2 extends parent
{
    void print()
    {
        get();
    }
}
public class example
{
    public static void main(String args[])
    {
        child1 a=new child1();
        a.display();
        child2 b=new child2();
        b.print();
    }
}