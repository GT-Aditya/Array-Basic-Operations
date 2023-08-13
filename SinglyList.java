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
    public static Node head = null;
    public static Node tail = null;
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

        // Displays the nodes present in the list
        //sList.display();
        minNode();
        maxNode();
        //reverse(sList.head);
    }

    public static void reverse(Node current) {
        //Checks if list is empty
        if(current == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            //Checks if the next node is null, if yes then prints it.
            if(current.next == null) {
                System.out.print(current.data + " ");
                return;
            }
            //Recursively calls the reverse function
            reverse(current.next);
            System.out.print(current.data + " ");
        }
    }


     public static void minNode() {
        Node current = head;
        int min;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            //Initializing min with head node data
            min = head.data;

            while(current != null){
                 //If current node's data is smaller than min
                 //Then, replace value of min with current node's data
                 if(min > current.data) {
                     min = current.data;
                 }
                 current= current.next;
            }
            System.out.println("Minimum value node in the list: "+ min);
        }
    }
public static void maxNode() {
        Node current = head;
        int max;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            //Initializing max with head node data
            max = head.data;

            while(current != null){
                 //If current node's data is greater than max
                 //Then, replace value of max with current node's data
                 if(max < current.data) {
                     max = current.data;
                 }
                 current = current.next;
            }
            System.out.println("Maximum value node in the list: "+ max);
        }
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
