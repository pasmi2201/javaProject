class parent
{
    public void get()
    {
        System.out.println("boruto uzumaki");
    }
}
class child extends parent
{
    void display()
    {
        get();
    }
}
public class inherit
{
    public static void main(String args[])
    {
    child obj=new child();
    obj.display();
    }
}