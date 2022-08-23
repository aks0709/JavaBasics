import java.util.Scanner;

public class CrossWorldPuzzle
{

    public static void main(String[] args) {
        int count=0,y=0,z=0;
        Scanner s1 = new Scanner(System.in);
        int x = s1.nextInt();
        char arr[][] = new char[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                arr[i][j] = s1.next().charAt(0);
            }
        }
        String word = s1.next();
        char []ch=new char[word.length()];
        for (int i = 0; i < word.length(); i++)
        {
             ch[i] = word.charAt(i);
        }
        //row traversing
        for(int i=0;i<x;i++)
        {
            count=0;
            y=0;
            for(int j=0;j<x;j++)
            {
                if(ch[y]==arr[i][j])
                {

                  if(y<word.length())
                  {
                      count++;
                  y++;
                  }
                  else continue;
                }
            }
            if(count==ch.length)
            {
                System.out.println("true");
            }
        }


        //column traversing
        for(int j=0;j<x;j++)
        {
            count=0;z=0;
            for(int i=0;i<x;i++)
            {
                if(ch[z]==arr[i][j])
                {
                    if(z<word.length()) {
                        count++;
                        z++;
                    }
                    else continue;
                }
            }
            if(count==ch.length)
            {
                System.out.println("true");
            }

        }

    }
}
