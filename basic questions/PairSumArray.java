import java.util.Scanner;

public class PairSumArray
{
    public static void main(String[] args)
    {
     int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of  an array");
        int x=sc.nextInt();
        int arr[]=new int[x];
        System.out.println("enter array entries");
        for (i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the required sum");
        int y= sc.nextInt();
        for(i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]+arr[j]==y)
                    System.out.println("pair that can form given sum is found at index "+i+" and index "+j);
            }
        }
    }
}
