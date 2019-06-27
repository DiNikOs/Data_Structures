package ru.geekbrain.HW.HW6;

public class Node<T extends Comparable<? super T>> {

    private final T value;

    private Node<T> leftChild;
    private Node<T> rightChild;

    private transient int deep;


    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public boolean shouldBeLeft(T value) {
        return value.compareTo(getValue()) < 0;
    }

    public boolean isLeaf() {
        return getLeftChild() == null && getRightChild() == null;
    }

    public int getDeep() {
        return deep;
    }

    public void setDeep (int deep) {
        this.deep = deep;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
