import java.util.*;
public class Calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Divition");
        int i=sc.nextInt();
        if(i==1)
        {
            System.out.println("Enter first integer:");
            int a=sc.nextInt();
            System.out.println("Enter second integer:");
            int b=sc.nextInt();
            int c=a+b;
            System.out.println(c);
        }
        else if(i==2)
        {
            System.out.println("Enter first integer:");
        int a=sc.nextInt();
        System.out.println("Enter second integer:");
        int b=sc.nextInt();
            int c=a-b;
            System.out.println(c);
        }
        else if(i==3)
        {System.out.println("Enter first integer:");
        int a=sc.nextInt();
        System.out.println("Enter second integer:");
        int b=sc.nextInt();
            int c=a*b;
            System.out.println(c);
        }
        else
        {
            System.out.println("Enter first integer:");
        int a=sc.nextInt();
        System.out.println("Enter second integer:");
        int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
        }
    }
}