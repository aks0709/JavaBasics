import java.util.*;
public class ArrayFirstProgram
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
         int x;
        System.out.println("enter size of array");
        x=s1.nextInt();

        int arr[]=new int[x];
        Scanner sc=new Scanner(System.in);



        System.out.println("ENTER " +x+ " numbers");
        for(int i=0;i<x;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++)
        {
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
