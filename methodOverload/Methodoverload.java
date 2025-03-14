public class Methodoverload
{
    public void Add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition:"+c);
    }
    public void Add(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println("Addition:"+d);
    }
    public static void main(String args[])
    {
        Methodoverload p=new Methodoverload();
        p.Add(10,20);
        p.Add(30,40,50);
    }
}