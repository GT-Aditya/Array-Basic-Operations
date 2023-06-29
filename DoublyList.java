public class DoublyList {

    //Represent a node of the doubly linked list

    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.previous = null;
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the doubly linked list
    public Node head = null;
    public Node tail = null;
    private int size = 0;

    public int size(){
        return size;
    }

    //addNode() will add a node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //If list is empty
        if(head == null) {
            //Both head and tail will point to newNode
            head = newNode;
            tail = newNode;
            size++;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode's previous will point to tail
            newNode.previous = tail;
            //newNode will become new tail
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
        // reach the node present at (given position - 1)
        if(size>=pos){
            while(ctr<pos-1){
                ptr = ptr.next;
                ctr++;
            }
            //Point newNode's next to the node present at the given position(pos)
            newNode.next = ptr.next;
            //Point newNode's previous to that node after which newNode must be inserted
            newNode.previous = ptr;
            //Point given position's(pos) node previous to newNode
            newNode.next.previous = newNode;
            //Point next of that node after which newNode must be insert to newNode
            ptr.next = newNode;
        }else{
            throw new IndexOutOfBoundsException("Index Out Of Bounds Exception : "+pos+" Position Not Found In List");
        }
    }

    //display() will print out the nodes of the list
    public void display() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Prints each node by incrementing the pointer.

            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        DoublyList dList = new DoublyList();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        dList.addNodeAt(6, 3);
        dList.removeFrom(3);
        dList.removeFrom(4);

        //Displays the nodes present in the list
        dList.display();
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
            ptr.next.previous = ptr; 
        }else{
            throw new IndexOutOfBoundsException("Index Out Of Bounds Exception : "+pos+" Position Not Found In List");
        }
    }
}