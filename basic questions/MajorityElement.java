import java.util.Scanner;

public class MajorityElement
{
    public static void main(String[] args)
    {
         int count1=0,count2=0;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter size of an array");
        int x=s1.nextInt();
        int arr[]=new int[x];
        System.out.println("enter entries of an array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s1.nextInt();
        }
        for(int i=0;i< arr.length;i++)
        {
            count1=0;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count1++;
                }
            }
            if(count1>=x/2)
            {
                count2++;
                System.out.println(arr[i]);
            }
        }
        if(count2==0)
        {
            System.out.println("there are no majority elements");
        }
        else
        System.out.println("there are " +count2+ " majority elements in an array");
    }
}
