import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MissingElement
{
    public static void main(String[] args)
    {
     int i;
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int arr[]=new int[x];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<arr.length;i++)
        {

        }
    }
}
