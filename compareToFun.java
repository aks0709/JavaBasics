import java.util.Scanner;

public class compareToFun
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1= s1.nextLine();
        System.out.println("enter string 2");
        String str2=s1.nextLine();
        int i=str1.compareTo(str2);
        if(i==0)
        {
            System.out.println("strings are same");
        }
        else {
            if(i>0)
                System.out.println("opposite to dictionary order");
            else
                System.out.println("in dictionary order");
        }
    }
}
