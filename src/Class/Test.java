package Class;

public class Test {
    public static void main(String[] args) {
        OurLinkedList<Object> linkedlist = new OurLinkedList<>();
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
