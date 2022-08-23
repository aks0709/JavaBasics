public class StringBuilderClass
{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ayush");
        sb.append("kumar");
        System.out.println(sb);
        sb.setCharAt(0,'A');
        System.out.println(sb);
        sb.insert(1,'a');
        System.out.println(sb);
        sb.delete(1,2);
        System.out.println(sb);
    }
}
