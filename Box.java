public class Box
{
    private int l,b,h;
    public Box()  //constructor has no return type
    {
        l=10;
        b=20;
        h=5;
    }
    public Box(int L,int B,int H)//argumented constructor arguments is passed inside a constructor
    {
        l=L;
        b=B;
        h=H;
    }
    private void showdimension()
    {
        System.out.println("\nL="+l+"\nB="+b+"\nH="+h);
    }

    public static void main(String[] args)
    {
        Box b1=new Box(); //argumented constructor cannot be used for this box becoz no argument is passed
        Box b2=new Box(20,50,5);//
        System.out.println("Box b1 dimensions");
        b1.showdimension();
        System.out.println("Box b2 dimensions");
        b2.showdimension();


    }
}
