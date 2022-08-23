public class Test
{
    private int x;
    private static int k;
    {                 //initialization block
        System.out.println("initialization block x="+x);
        x=5;
    }

    static
    {
        System.out.println("static initialization block k="+k);
        k=10;
    }
    public Test()   //constructor
    {
        System.out.println("construcor x="+x);
    }

    public static void main(String[] args)
    {
        new Test();
        Test t1=new Test();
    }
}
