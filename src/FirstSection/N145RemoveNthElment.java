package FirstSection;

import java.util.Scanner;

public class N145RemoveNthElment {
Node2 root;
public static void main(String[]args){
    Node2 list=new Node2(1);
    list.next=new Node2(2);
    list.next.next=new Node2(3);
    list.next.next.next=new Node2(4);
    list.next.next.next.next=new Node2(5);
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),i=0;
    Node2 o=list;
    while(o!=null){
        System.out.print(o.digit+"  ");
        o=o.next;
    }
    System.out.println();
    list=RemoveNthFromEnd(list,n);

    while(list!=null){
        System.out.print(list.digit+"  ");
        list=list.next;
    }

    }

    public static Node2 RemoveNthFromEnd(Node2 node,int n){
    Node2 h=node;
    int size=0;
    while(h!=null){
        size++;
        h=h.next;
    }
    if(size==n)node=node.next;
    int index=size-n;
    Node2 t=node;
    while(index>1){
        index--;
        t=t.next;
    }
    if(size!=n)t.next=t.next.next;
    return node;
    }

}
class Node2{
    Node2 next;
    int digit;
    public Node2(){

    }
    public Node2(int digit){
        this.digit=digit;
        next=null;
    }
}