class A{
    public void f1(int x){
        System.out.println("classs A");
    }
}

class B extends A{
    public void f1(int x,int y){
        System.out.println("classs B");
    }
}

public class overload
{
    public static void main(String[] args) {
        B obj=new B();
        obj.f1(3,4);
        obj.f1(5);
    }
}
