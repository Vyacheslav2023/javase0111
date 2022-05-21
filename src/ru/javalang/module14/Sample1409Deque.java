package ru.javalang.module14;

public class Sample1409Deque {
    public static void main(String[] args) {
        java.util.Deque<String> deque
                = new java.util.LinkedList<String>();
        deque.offer("Oklahoma");
        deque.offer("Indiana");
        deque.addFirst("Texas");
        deque.offer("Georgia");
        while (deque.size() > 0)
            System.out.print(deque.remove() + " ");
    }
}
