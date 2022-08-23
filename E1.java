public class E1
{
    static class person{
        private int age;
        private String name;
        public void setName(String n){
            name=n;
        }
        public void setAge(int a)
        {
            age=a;
        }
        public int getAge(){
            return age;
        }
        public String getName(){
            return name;
        }
    }

    static class student extends person{
        private int rollno;
        private String name;
        public void Setrollno(int r)
        {
            rollno = r;
        }
        public int getrollno()

        {
            return rollno;
        }
    }
    public static void main(String[] args)
    {
        student s1=new student();
       s1.Setrollno(18);
       s1.setName("Ayush");
       s1.setAge(19);
        System.out.println("rollno="+s1.getrollno());
        System.out.println("name="+s1.getName());
        System.out.println("age="+s1.getAge());

    }
}
