import java.util.*;
public class Vowel
{
    public static void main(String args[])
    {
        String a[]={"a","e","i","o","u"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the letter to find vowel:");
        String v=sc.nextLine();
        int detect=0;
        int i=0;
        while(i<=4)
        {
            if(v.equals(a[i]))
            {
                detect=1;
            }
        i=i+1;
        }
        if(detect==1)
        {
            System.out.println("The letter is vowel");
        }
        else
        {
            System.out.println("The letter is not vowel");
        }
        
        }}
