import java.util.*;
public class Input
{

    public static void main(String[] args)
    {

        System.out.println("enter name and age");
        Scanner s1=new Scanner(System.in);
        String name=s1.nextLine();
        int age=s1.nextInt();
        System.out.println("Name="+name+"\nAge="+age);

    }
}
