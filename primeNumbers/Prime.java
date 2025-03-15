import java.util.*;
public class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        int i=1;
        int detect=0;
        while(i<=n)
        {
            if(n%i==0)
            {
                detect=detect+1;
            }
            i=i+1;
        }
        if(detect==3)
        {
            System.out.println("not Prime number");
        }
        else
        {
            System.out.println("Prime number");
        }

    }
}