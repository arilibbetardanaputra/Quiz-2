package quiz2mi1a;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        dll.printFromTail();
        
        dll.deleteLast();
        dll.print();
        dll.printFromTail();
        
        DoubleLinkedList dll2 = new DoubleLinkedList();
        dll2.addFirst(5);
        dll2.addFirst(25);
        dll2.addFirst(35);
        dll2.addFirst(45);
        dll2.print();
        split(dll2);
    }
    
    // No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1, DoubleLinkedList dll2) {
        // Implementation not required as per instructions
    }
    
    // No. 3 Kode Genap
    public static void split(DoubleLinkedList dll) {
        if (dll.size < 2) {
            System.out.println("List is too small to split.");
            return;
        }
        
        DoubleLinkedList list1 = new DoubleLinkedList();
        DoubleLinkedList list2 = new DoubleLinkedList();
        
        Node current = dll.head;
        int mid = dll.size / 2;
        int count = 0;
        
        while (current != null) {
            if (count < mid) {
                list1.addLast(current.data);
            } else {
                list2.addLast(current.data);
            }
            current = current.n;
            count++;
        }
        
        System.out.println("List 1:");
        list1.print();
        System.out.println("List 2:");
        list2.print();
    }
}
