public class Example
{
    public void Add(int num1,int num2)
    {
        int num3=num1+num2;
        System.out.println(num3);
    }
    public static void main(String args[])
    {
        Example obj=new Example();
        obj.Add(20,30);
    }
    
}