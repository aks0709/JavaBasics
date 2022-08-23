import java.util.Scanner;

public class RotateString
{
    public StringBuilder Rotatestring(int T,StringBuilder str)
    {
        for(int j=1;j<=T;j++)
        {
            int l = str.length()-1;
            char c = str.charAt(l);
            for (int i = str.length()-1; i >0; i--)
            {
                char ch = str.charAt(i - 1);
                str.setCharAt(i, ch);
            }
            str.setCharAt(0, c);
        }
        return str;
    }
    public static void main(String[] args)
    {
        RotateString r1=new RotateString();
        Scanner sc=new Scanner(System.in);
        StringBuilder str1=new StringBuilder("amazon");
        StringBuilder str2=new StringBuilder("onamaz");

        System.out.println("enter no of rotation");
        int x=sc.nextInt();
        System.out.println("before rotation");
        System.out.println("str1="+str1);
        System.out.println("str2="+str2);

        r1.Rotatestring(x,str1);
        System.out.println("after rotation strings become");
        System.out.println("str1="+str1);
        System.out.println("str2="+str2);
        if(str1.compareTo(str2)==0)
            System.out.println("Strings are same");
        else System.out.println("strings are not same");

    }
}
