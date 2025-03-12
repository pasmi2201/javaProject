public class Return1
{
    public int integer(int num)
    {
        return num;
    }
    public static void main(String args[])
    {
        Return1 obj=new Return1();
        int a=obj.integer(45);
        System.out.println(a);
    }

}