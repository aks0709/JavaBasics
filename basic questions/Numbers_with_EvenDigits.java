import java.util.Arrays;

public class Numbers_with_EvenDigits
{
    public static void main(String[] args) {
        int arr[]={12,345,2,6,7896};
        int ans=evendigits(arr);
        System.out.println(ans);
    }

    static int evendigits(int arr[])
    {
        int count=0;
     for (int i=0;i< arr.length;i++)
     {
      int noofdigits=digi(arr[i]);
      if (noofdigits%2==0)
          count++;
     }
     return count;  //thiscount signifies number of number with even digits
    }

    static int digi(int n)
    {
        int count=0;  //count signifies number of digits
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        return count;
    }
}
