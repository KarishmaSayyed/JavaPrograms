public class LinkedList {

    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;  // n will travel from head till it finds a null node.
            while(n.next != null){
                n = n.next;  //will move to next node until null node is found
            }
            n.next = node; // once null is found, it will come out of while loop and assign the new node value to existing null node.
        }
    }

    public void show(){
        Node node = head;

        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
