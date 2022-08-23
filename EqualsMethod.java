import java.util.*;
public class EqualsMethod
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter a string");
        String str= s1.nextLine();
        System.out.println("enter string 2");
        String str2= s1.nextLine();
        if(str.equals(str2))
            System.out.println("strings are same");
        else
            System.out.println("strings are not same");
    }
}
