package FirstSection;

public class N135LInkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int item){
            data=item;
            next=null;
        }
    }
    void  remove_Duplicates(){
        Node current=head;
        Node next_next;
        if(head==null)return ;
        while(current.next!=null){
            if(current.data==current.next.data){
                next_next=current.next.next;
                current.next=null;
                current.next=next_next;
            }
            else current=current.next;
        }
    }
    public void push(int new_data){
        Node new_ob=new Node(new_data);
        new_ob.next=head;
        head=new_ob;
    }

    void print_List(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data);
             if(temp.next!=null){
                 System.out.print("->");
             }
             temp=temp.next;
         }
    }

    public static void main(String[] args) {
        N135LInkedList list=new N135LInkedList();
        list.push(17);
        list.push(17);
        list.push(16);
        list.push(15);
        list.push(15);
        list.push(14);
        list.push(13);
        list.push(12);
        list.push(12);


        list.print_List();
        list.remove_Duplicates();
        System.out.println();
        list.print_List();

    }
}