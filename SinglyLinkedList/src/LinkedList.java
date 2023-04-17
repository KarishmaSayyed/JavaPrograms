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
        System.out.println(node.data);
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0){
            insertAtStart(data);
        }
        else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void delete(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            Node temp = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
            temp = null;
        }
    }
}
