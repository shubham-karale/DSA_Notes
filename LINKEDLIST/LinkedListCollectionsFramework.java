import java.util.LinkedList;

public class LinkedListCollectionsFramework {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Anuj");
        ll.add("Gaurav");

        ll.addFirst("Lokesh");
        ll.addLast("Harsh");

        ll.add(2, "Kushal");

        System.out.println("Initial list of elements: "+ll);

        ll.remove("Vijay");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println("After deletion: "+ll);
    }

}
