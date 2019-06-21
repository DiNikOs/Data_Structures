package ru.geekbrain.HW.HW4;

import java.util.Iterator;

public class SimpleLinkedListImpl<E> implements LinkedList<E> {

    protected Entry<E> firstElement;//001[005]
    protected int size;
    private E value;

    @Override//O(1)
    public void insertFirst(E value) {
        Entry<E> entry = new Entry<>(value);//002[007]
        entry.next = firstElement;//007[...next->005]
        firstElement = entry;//001[007]
        size++;
    }

    @Override//O(1)
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        E removedValue = this.firstElement.value;
        firstElement = firstElement.next;
        size--;
        return removedValue;
    }

    @Override
    public boolean remove(E value) {
        Entry<E> previous = null;
        Entry<E> current = firstElement;

        while (current != null) {
            if (current.value.equals(value)) {
                break;
            }
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        if (current == firstElement) {//previous == null
            firstElement = firstElement.next;//current.next
        }
        else {
            previous.next = current.next;
        }

        size--;
        return true;
    }

    @Override
    public boolean contains(E value) {
        Entry<E> current = firstElement;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        System.out.println("----------");
        Entry<E> current = firstElement;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("----------");
    }

    @Override
    public E getFirstElement() {
        return firstElement.value;
    }

    @Override
    public void setFirst(E value) {
        this.value = value;
    }

    @Override
    public Entry getFirst() {
        return firstElement;
    }

//    public LinkedIteratorImpl<E> getIterator() {
//        return new LinkedIteratorImpl<>(this);
//    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedIteratorImpl<E>(this);
    }

    @SuppressWarnings("unchecked")
    private class LinkedIteratorImpl<E> implements LinkIterator<E> {

        protected LinkedList.Entry<E> current;//001[005]
        protected LinkedList.Entry<E> previous;
        private SimpleLinkedListImpl list;
        protected int size;

        public LinkedIteratorImpl(SimpleLinkedListImpl list) {
            this.list = list;
            this.reset();
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public void insertAfter(E value) {
            LinkedList.Entry newItem = new LinkedList.Entry(value);
            if (list.isEmpty()){
                list.firstElement = newItem;
                current = newItem;
            } else {
                newItem.next = current.next;
                current.next = newItem;
                next();
            }
        }

        @Override
        public void insertBefore(E value) {
            LinkedList.Entry newItem = new LinkedList.Entry(value);
            if(previous == null) {
                newItem.next = list.firstElement;
                list.firstElement = newItem;
                reset();
            }
            else {
                newItem.next = previous.next;
                previous.next = newItem;
                current = newItem;
            }
        }

        @Override
        public E next() {
            E nextValue = current.value;
            previous = current;
            current = current.next;
            return nextValue;
        }

        @Override
        public void reset() {
            current = list.firstElement;
            previous = null;
        }

        @Override
        public E deleteCurrent() {
            E value = current.value;
            if (previous == null) {
                list.setFirst(current.next);
                reset();
            } else  {
                previous.next = current.next;
                if (atEnd()) {
                    reset();
                } else {
                    current = current.next;
                }
            }
            return (E) value;
        }

        @Override
        public void remove() {
            if (previous == null){
                list.firstElement = current.next;
                reset();
            } else {
                previous.next = current.next;
                if ( !hasNext() ) {
                    reset();
                } else {
                    current = current.next;
                }
            }
        }

        @Override
        public boolean atEnd() {
            return (current.next == null);
        }

        @Override
        public E getCurrent() {
            return (E) current;
        }

//        @Override
//        public Iterator<E> iterator() {
//            return null;
//        }
    }
}
