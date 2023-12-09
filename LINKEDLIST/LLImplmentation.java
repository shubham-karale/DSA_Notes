public class LLImplmentation {

    static Node head;
    private int size;

   static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

//    Insertion -> At the Beginning
    public static void addFirst(int data){

//       Check LL is empty of not if it is empty then create new node and return it
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
//        If LL is already exists
        newNode.next = head;
        head = newNode;
    }

//    Insertion -> At the End
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

//    Insertion -> At the given position
    public static void addAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        int count = 1;
        while(count < position-1){
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

//    Printing the LL
    public static void printLL(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

//    Deletion -> At the Beginning
    public static void deleteFirst(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        head = head.next;
    }

//    Deletion -> At the End
    public static void deleteLast(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        /*
        if(head.next == null){
            head = null;
            return;
            }
          Node secondLast = head;
          Node lastNode = head.next;
            while(lastNode.next != null){
                secondLast = secondLast.next;
                lastNode = lastNode.next;
            }
         */

    }

//    Deletion -> At the given position
    public static void deleteAtPosition(int position){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;
        int count = 1;
        while(count < position-1){
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
    }

//    get the size of the LL
    public static int getSize(){
        if(head == null){
            return 0;
        }
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println("LinkedList Implementation");
        LLImplmentation ll = new LLImplmentation();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(40);

        printLL();




    }
}
