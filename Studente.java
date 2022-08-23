public class Studente
{
    int rollno;
    String name;
    String city;

    Studente(int rollno, String name, String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }

    public String toString(){//overriding the toString() method
        return rollno+" "+name+" "+city;
    }
        public static void main(String args[]){
        Studente s1=new Studente(101,"Raj","lucknow");
        Studente s2=new Studente(102,"Vijay","ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }
}
