public class OwnLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
    static OwnLinkedList insert(OwnLinkedList list, int data){
        Node new_node=new Node(data);

        if(list.head==null){
            list.head=new_node;
        }else{
            Node first=list.head;
            while(first.next!=null){
                first=first.next;
            }
            first.next=new_node;

        }

        return list;
    }

    static void printLinkedList(OwnLinkedList list){
        Node first=list.head;

        while(first.next!=null){
            System.out.print(first.data+" ");
            first=first.next;
        }

    }


    public static void main(String[] args) {
        OwnLinkedList list=new OwnLinkedList();
        list=insert(list,1);
        list=insert(list,10);
        list=insert(list,100);
        printLinkedList(list);
    }
}
