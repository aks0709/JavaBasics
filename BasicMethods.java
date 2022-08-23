import java.util.Scanner;

public class BasicMethods
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1=s1.nextLine();
        System.out.println("enter string 2");
        String str2=s1.nextLine();
        System.out.println("string 1 in upper case");
        String str3=str1.toUpperCase();
        System.out.println(str3);
        int i=str1.compareTo(str2);
        if(i==0)
            System.out.println("Strings are same");
        else {
            if(i>0)
                System.out.println("oppsite to dictionary order");
            else
                System.out.println("in dictionary order");
        }

    }
}
