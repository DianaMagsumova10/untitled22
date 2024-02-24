package lessons16;

public class MyLinkedList<E> implements MYList<E> {

    private int size;
    private Node<E> head = new Node<>();
    private Node<E> tail = new Node<>();

    public MyLinkedList() {
        head.previous = tail;
        tail.next = head;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E element) {
        size++;
        Node<E> preTail = tail.previous;
        Node<E> node = new Node<>(element);
        node.previous = preTail;
        node.next = tail;

        preTail.next = node;
        tail.previous = node;


//        Node<E> currentNode = head;
//        while (currentNode.next != null){
//            currentNode = currentNode.next;
//        }
//        currentNode.next = new Node<>(element);

    }

    @Override
    public E getByIndex(int index) {
        return null;
    }


    private static class Node<T> {
        public T value;
        public Node<T> next;
        public Node<T> previous;

        public Node(T value) {
            this.value = value;
        }

        public Node() {
        }
    }
}


