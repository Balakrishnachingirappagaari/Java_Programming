public class SingleLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    public static SingleLinkedList insert(SingleLinkedList list, int data){
        Node new_node=new Node(data);

        if(list.head==null){
            list.head=new_node;
        }else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }

    public static void printList(SingleLinkedList list){

        Node first=list.head;
        System.out.print("Linked list is ");
        while(first!=null){
            System.out.print(first.data+" ");
            first=first.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList sll=new SingleLinkedList();
        sll=insert(sll,1);
        sll=insert(sll,10000);
        sll=insert(sll,10);
        sll=insert(sll,100);
        sll=insert(sll,1000);
        sll=insert(sll,10000);
        printList(sll);

    }
}
