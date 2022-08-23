public class GettersSetters
{
    public static void main(String[] args) {
     employee e1=new employee();
     e1.setName("Ayush");
     e1.setId(18);
        System.out.println(e1.getName());
        System.out.println(e1.getId());
    }
}

class employee{
    private int i;
    private String name;

    public void setName(String name){
        this.name=name;
    }

    public void setId(int i){
        this.i=i;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return i;
    }
}