public class GenericMethods
{
    public <E> void printArray(E []s)
    {
        for(E x:s)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args)
    {
        String countries[]={"INDIA","PAKISTAN","NEPAL"};
        Integer num[]={32,233,43,12,32};
        GenericMethods gm1=new GenericMethods();
        gm1.printArray(countries);
        gm1.printArray(num);

    }
}
