import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram
{
    public static String sortstring(String inputstring){
        char temparray[]=inputstring.toCharArray();
        Arrays.sort(temparray);
        return new String(temparray);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sortstring(s1);
        System.out.println(s2);
    }
}
