import java.util.*;

public class charAtmethod
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        String str1=s1.nextLine();
        for(int i=0;i<str1.length();i++)
        {
            System.out.println(str1.charAt(i));
        }
    }
}
