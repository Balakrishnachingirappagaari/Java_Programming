public class FinalLinkedList {

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    static FinalLinkedList insert(FinalLinkedList list, int data){
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

    static void display(FinalLinkedList list){
        Node node=list.head;
        while(node.next!=null){
            System.out.print(node.data+" ");
            node =node.next;
        }
    }

    public static void main(String[] args) {
        FinalLinkedList list=new FinalLinkedList();
        list=insert(list,1);
        list=insert(list,10);
        list=insert(list,100);
        display(list);
    }
}
