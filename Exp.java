
public class Exp
{
    public static void main(String[] args)
    {
        Outer out=new Outer();     //since inner class is non static we need to make object of outer class
        Outer.Inner o1=out.new Inner();    //that object call (new)
        o1.fun1();

        Outer2.Inner2 obj=new Outer2.Inner2();
        obj.fun2();

    }
}

class Outer{
    class Inner
    {
        void fun1()
        {
            System.out.println("FUNCTION Called SUCCESSFULLY FROM NON STATIC INNER CLASS");
        }
    }
}

class Outer2
{
    static class Inner2
    {
        void fun2()
        {
            System.out.println("FUNCTION IS CALLED FROM STATIC INNER CLASS");
        }
    }
}