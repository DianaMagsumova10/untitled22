package org.example;

import java.security.Key;

public class Node<K, V> {
    public K key;
    public V value;
    public Node<K, V> next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

}
    class MyHashMap<K, V> {
        public int capacity;
        public Node<K, V>[] arr = new Node[10];

        public void put(K key, V value) {
            int keyHashCode = key.hashCode();
            int index = keyHashCode % capacity;
            if (arr[index] == null) {
                arr[index] = new Node<>(key, value);
            } else {
                Node<K, V> currentNode = arr[index];
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                } else {
                    Node<K, V> node = new Node<>(key, value);
                    while (currentNode.next != null) {
                        currentNode = currentNode.next;
                    }
                    currentNode.next = node;

                }
            }


        }
    }