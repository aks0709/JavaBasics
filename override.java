class a{
    public void f1(int x){
        System.out.println("classs A");
    }
}

class b extends a{
    public void f1(int x){
        System.out.println("classs B");
    }
}

public class override
{
    public static void main(String[] args) {
        b obj=new b();
        obj.f1(9);//class b override/dominate over class a
    }
}
