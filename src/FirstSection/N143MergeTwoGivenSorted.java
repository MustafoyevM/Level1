package FirstSection;

public class N143MergeTwoGivenSorted {
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(7);
        ListNode list2=new ListNode(2);
        list2.next=new ListNode(5);
        ListNode temp=merge(list,list2);
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public static ListNode merge(ListNode node1,ListNode node2){
        ListNode h=new ListNode(0);
        ListNode templist=h;
        while(node1!=null && node2!=null){
            if(node1.value<node2.value){
                templist.next=new ListNode(node1.value);
                templist=templist.next;
                node1=node1.next;
            }
            else{
                templist.next=new ListNode(node2.value);
                templist=templist.next;
                node2=node2.next;
            }
        }
        while(node1!=null){
            templist.next=new ListNode(node1.value);
            templist=templist.next;
            node1=node1.next;
        }
        while(node2!=null){
            templist.next=new ListNode(node2.value);
            templist=templist.next;
            node2=node2.next;
        }
        h=h.next;
        return h;
    }
}
class ListNode{
    int value;
    ListNode next;
    ListNode(){

    }
    ListNode(int a){
        value=a;
        next=null;
    }
}
