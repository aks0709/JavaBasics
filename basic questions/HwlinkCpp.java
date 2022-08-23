import java.util.Scanner;

public class HwlinkCpp
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        for(int j=0;j<testcases;j++) {
            int districts = sc.nextInt();
            int party[] = new int[districts];
            for (int i = 0; i < party.length; i++) {
                party[i] = sc.nextInt();
            }
             count=0;
            for(int i=0;i<party.length;i++)
            {
                if(party[i]>districts/2)
                {

                    System.out.println(+(i+1)+"\t");
                    count++;
                }
            }

            if(count==0){
                System.out.println("void");
            }

        }
    }
}
