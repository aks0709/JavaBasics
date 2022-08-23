public class StringObject
{
    public static void main(String[] args)
    {
        String str1="computer";
        String str2="computer";
        String str3=new String("computer");  //new object is created
        System.out.println("result 1="+(str1==str2));
        System.out.println("result 2="+str1.equals(str2));
        System.out.println("result 3="+(str1==str3));   //false because both are different refernce variable
        System.out.println("result 4="+str1.equals(str3));  //true becoz strings are same

    }
}
