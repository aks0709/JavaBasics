import java.util.Scanner;
public class IndexOfMethod
{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter a string");
        String str= s1.nextLine();
        int i=str.indexOf('A',3);
        System.out.println("Index is ="+i);

    }
}
