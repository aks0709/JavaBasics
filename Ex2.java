class Greeting{
    public void sayHello()
    {
        System.out.println("hello");
    }
}

class India{
    Greeting g1=new Greeting(){
        @Override
        public void sayHello() {
            System.out.println("Namaste");
        }
    };
}
public class Ex2
{
    public static void main(String[] args) {
    India i1=new India();
    i1.g1.sayHello();
    }
}


