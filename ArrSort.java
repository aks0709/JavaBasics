import java.util.*;

public class ArrSort
{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter size of array");
        int x=s1.nextInt();
        int arr[]=new int[x];
        System.out.println("enter entries of array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s1.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("arr["+i+"]="+arr[i]);
        }

    }
}
