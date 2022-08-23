import java.util.Scanner;

public class SubString
{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1=s1.nextLine();
        System.out.println("enter starting index");
        int x=s1.nextInt();
        System.out.println("enter ending index");
        int y=s1.nextInt();
        String str2=str1.substring(x,y);
        System.out.println(str2);
    }
}
