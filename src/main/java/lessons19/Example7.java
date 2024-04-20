package lessons19;

public class Example7 {
}

class Stack<E> {
    private int size;
//    private static final Node<Object> ZERO_Node = new Node<>();
    private Node<E> lastNode = new Node<>();

    E push(E object) {
        size++;
        Node<E> node = new Node<>();
        node.value = object;
        node.previous = lastNode;
        lastNode = node;
        return object;
    }

    E peek() {
        if(isEmpty()){
            return null;
        }else {
            return lastNode.value;
        }
    }

    E pop() {
        if(lastNode.previous == null){
            return null;
        }
        size--;
        Node<E> node = lastNode.previous;
        E value = lastNode.value;
        lastNode = node;
        return value;
    }

    boolean isEmpty() {
        return size == 0;
    }

    static class Node<T> {
        public T value;
        public Node<T> previous;
    }
}