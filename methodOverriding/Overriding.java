class parent
{
    void get()
    {
        System.out.println("Mito Uzumaki");
    }
}
class child extends parent
{
    void get()
    {
        System.out.println("Hashirama senju");
    }
}
public class Overriding
{
    public static void main(String args[])
    {
        child obj=new child();
        obj.get();
    }
}
