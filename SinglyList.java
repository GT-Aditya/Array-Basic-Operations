public class SinglyList{
     //Represent a node of the singly linked list
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;
    //Represent the number of elements in singly linked list
    private int size = 0;

    public int size(){
        return size;
    }

    // addNode() will add a new node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
            size++;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
            tail = newNode;
            size++;
        }
    }
    // addNodeAt() will add a new node to the list at given position
    public void addNodeAt(int data, int pos) {
        // Create a new node
        Node newNode = new Node(data);
        Node ptr = head;
        int ctr = 1;

        if(size>=pos){
            // reach the node present at (given position - 1)
            while(ctr<pos-1){
                ptr = ptr.next;
                ctr++;
            }
            //Point newNode's next to the node present at the given position(pos)
            newNode.next = ptr.next;
            //Point next of that node after which newNode must be insert to newNode
            ptr.next = newNode;
            size++;
        }else{
            throw new IndexOutOfBoundsException("Position out of bound.");
        }
    }

    // display() will display all the nodes present in the list
    public void display() {
        // Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SinglyList sList = new SinglyList();

        // Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        sList.addNodeAt(5, 3);

        sList.removeFrom(3);
        sList.removeFrom(4);

        // Displays the nodes present in the list
        sList.display();
    }

    public void removeFrom(int pos) {
        Node ptr = head;
        int ctr = 1;
        if(size>=pos){
            while(ctr<pos-1){
                ptr = ptr.next;
                ctr++;
            }
            ptr.next = ptr.next.next;
        }else{
            throw new IndexOutOfBoundsException("Index Out Of Bounds Exception : "+pos+" Position Not Found In List");
        }
    }

}
