import java.io.*;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head;

        static class Node{
            Node next;
            int data;

            Node(int d){
                data=d;
                next=null;
            }

        }


        static LinkedList insert(LinkedList list,int data){
            Node new_data=new Node(data);
            if(list.head==null){
                list.head=new_data;
            }else{
                Node first=list.head;
                while(first.next!=null){
                    first=first.next;
                }
                first.next=new_data;
            }

            return list;

        }

        static void display(LinkedList list){

            Node node=list.head;
            while(node!=null){
                System.out.print(node.data+" ");
                node =node.next;
            }

        }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list=insert(list,1);
        list=insert(list,10);
        list=insert(list,100);
        display(list);
    }


}
