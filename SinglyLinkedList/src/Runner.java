public class Runner {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(25);

        list.insertAtStart(35);

        list.insertAt(0,78);

        list.delete(3);

        list.show();
    }
}
