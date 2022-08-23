import java.util.Scanner;

public class Solution
{
    public int maxSumSubArray(int a[]){
        int maxsum=0;
        int cursum=0;
        for(int i=0;i<a.length;i++)
        {
            cursum=cursum+a[i];
            if(cursum>maxsum)
            {
                maxsum=cursum;
            }
            if(cursum<0)
            {
                cursum=0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args)
    {
        Solution s1=new Solution();
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int y= s1.maxSumSubArray(arr);
        System.out.println(y);
    }
}
