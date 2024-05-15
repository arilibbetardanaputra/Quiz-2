package quiz2mi1a;

public class DoubleLinkedList {
    Node head, tail;
    int size;
    
    DoubleLinkedList() {
        head = tail = null;
        size = 0;
    }
    
    boolean isEmpty() {
        return size == 0;
    }
    
    void addFirst(int data) {
        Node nu = new Node(data);
        if (isEmpty()) {
            head = tail = nu;
        } else {
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    }
    
    void deleteFirst() {
        if (!isEmpty()) {
            head = head.n;
            if (head != null) {
                head.p = null;
            } else {
                tail = null;
            }
            size--;
        }
    }
    
    void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print("" + tmp.data + "-");
            tmp = tmp.n;
        }
        System.out.println("");
    }
    
    // Soal No 1 Kode Ganjil
    void addLast(int data) {
        // Implementation not required as per instructions
    }
    
    // Soal No 1 Kode Genap
    void deleteLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.p;
                tail.n = null;
            }
            size--;
        }
    }
    
    // Soal No 2 Kode Ganjil dan Genap
    void printFromTail() {
        Node tmp = tail;
        while (tmp != null) {
            System.out.print("" + tmp.data + "-");
            tmp = tmp.p;
        }
        System.out.println("");
    }
}
