import java.util.Arrays;
import java.util.Scanner;

public class StringSortFun
{
    public static String sortstring(String inputstring){
        char temparray[]=inputstring.toCharArray();
        Arrays.sort(temparray);
        return new String(temparray);
    }
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1\n");
        String s1=sc.nextLine();
        System.out.println("enter string 2\n");
        String s2= sc.nextLine();
        String s3=sortstring(s1);
        String s4=sortstring(s2);
        char temp1[]=s3.toCharArray();
        char temp2[]=s4.toCharArray();
        if(temp1.length==temp2.length)
        {
            for(i=0;i<temp1.length;i++)
            {
                if(temp1[i]!=temp2[i])
                    break;
            }
            if(i==temp1.length)
                System.out.println("strings are anagram");
            else System.out.println("strings are not anagram");
        }
        else System.out.println("strings are not anagram");
    }
}
