import java.util.*;
public class Addition1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one integers:");
        int num1=sc.nextInt();
        System.out.println("Enter another one integer:");
        int num2=sc.nextInt();
        int num3=num1+num2;
        System.out.println(num3);
    }
}