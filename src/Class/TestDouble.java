package Class;

public class TestDouble {
    public static void main(String[] args) {
        DoubleLinkedList<String> linkedlist = new DoubleLinkedList<String>();
        linkedlist.add("gitHub");
        linkedlist.add("Sahin");
        linkedlist.add("Karadeniz");
        linkedlist.display();
        System.out.println("-----------------");
        linkedlist.delete();
        linkedlist.display();
        System.out.println("-----------------");
        linkedlist.delete();
        linkedlist.display();

    }

}
