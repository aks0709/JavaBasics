public class RemoveDuplicate
{
    private ListNode head;
    public static class ListNode {
        private int data;
        private ListNode next=null;
        public ListNode(int data) {
            this.data = data;
        }
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.println(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void removeduplicate(){
        if(head==null)
            return;
        else{
            ListNode current=head;
            while(current!=null&&current.next!=null){
                if (current.data==current.next.data){
                    current.next=current.next.next;
                }
                else {
                    current=current.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        RemoveDuplicate sll=new RemoveDuplicate();
        sll.head=new ListNode(1);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(2);
        ListNode fourth=new ListNode(3);
        ListNode fifth=new ListNode(3);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        sll.display();

        sll.removeduplicate();
        sll.display();
    }
}
