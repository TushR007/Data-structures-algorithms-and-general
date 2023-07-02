public class ll {  //Based on kunal kushwaha's linked list series

    private Node head;
    private Node tail;
    private int size;

    public ll(){
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next=node;
        tail = node;
        size++;
    }

    public void insertAtIndex(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;

        for(int i = 1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;

        if(head.next == null){
            tail = null;
        }

        return val;
    }

    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.val + "=>");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }

    }



    public static void main(String[] args) {
        ll list = new ll();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(50);
        list.insertAtIndex(100, 5);
        System.out.println(list.deleteFirst());

        list.display();

    }
}

