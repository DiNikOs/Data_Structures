package ru.geekbrain.HW.HW4.IteratorHW4;

public class LinkedList {

    private Link first;

    public LinkedList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst (Link first) {
        this.first = first;
    }

    public LinkIterator getIterator () {
        return new LinkIterator(this);
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void display() {
        System.out.println("----------");
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println("----------");
    }

}
