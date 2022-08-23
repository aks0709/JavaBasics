public class GenericClass
{
    public static void main(String[] args) {
        MyData <Integer> m1=new MyData <Integer> ();
        MyData <String> m2=new MyData <String> ();
        Integer k=new Integer(5);
        m1.add(k);
        m2.add("AYUSH");
        System.out.println("m1="+m1.get()+"\nm2="+m2.get());

    }
}

class MyData<T>
{
    T i;
    public void add(T i1){
        i=i1;
    }
    public T get(){
        return i;
    }
}