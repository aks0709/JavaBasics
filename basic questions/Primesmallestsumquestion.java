import java.util.*;
class prime
{
 public int isprime(int x)
 {
     int count=0;
  for(int i=1;i<=x;i++)
  {
      if(x%i==0)
      {
          count++;
      }
  }
  if(count==2)
      return x;
  else
      return 0;
 }
}
public class Primesmallestsumquestion
{
    static int sum=0,y=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {

                sum=arr[i]+arr[i+1];
                prime p1=new prime();
                 y=p1.isprime(sum);
                 if(y==0)
                     continue;
                 else
                     break;

        }
        System.out.println("sum="+y);

    }
}
