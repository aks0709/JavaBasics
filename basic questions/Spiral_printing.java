public class Spiral_printing
{
    private Listnode head;
    public class Listnode
    {
        private int data;
        private Listnode next;
        public Listnode(int data){
            this.data=data;
        }
    }

    public int length()
    {
        if(head==null)
            return 0;


        int count=0;
        Listnode current=head;
        while (current.next!=null)
        {
            current=current.next;
            count++;
        }
        return count;
    }
    public void display_spiral()
    {

    }
    public void display()
    {
        Listnode current=head;
        while(current!=null)
        {
            System.out.println(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }


    public void insertfirst(int value)
    {
        Listnode newNode=new Listnode(value);
        newNode.next=head;
        head=newNode;
    }
    public static void main(String[] args)
    {
        Spiral_printing s1=new Spiral_printing();
        s1.insertfirst(8);
        s1.insertfirst(7);
        s1.insertfirst(6);
        s1.insertfirst(5);
        s1.insertfirst(4);
        s1.insertfirst(3);
        s1.insertfirst(2);
        s1.insertfirst(1);
        s1.display();
    }
}
