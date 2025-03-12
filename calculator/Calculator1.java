public class Calculator1
{
    public int Add(int add1,int add2)
    {
        return add1+add2;
    }
    public int subtract(int sub1,int sub2)
    {
        return sub1-sub2;
    }
    public int multiply(int multi1,int multi2)
    {
        return multi1*multi2;
    }
    public int Divide(int div1,int div2)
    {
        return div1/div2;
    }
    public static void main(String args[])
    {
        Calculator1 obj=new Calculator1();
        int a=obj.Add(12,45);
        int b=obj.subtract(39,34);
        int c=obj.multiply(23,45);
        int d=obj.Divide(43,78);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}