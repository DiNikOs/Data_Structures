package ru.geekbrain.HW.HW4;

import ru.geekbrain.HW.HW4.LinkedList;
import ru.geekbrain.HW.HW4.SimpleLinkedListImpl;

public class LinkIteratorApp {

    public static void main(String[] args) {

        LinkedList<Integer> list = new SimpleLinkedListImpl<>();
        for (int i = 1; i < 6 ; i++) {
            list.insertFirst(i);
        }
        displayAll(list);
        System.out.println("-----------");

        LinkIterator<Integer> iterator = (LinkIterator<Integer>) list.iterator();
        iterator.reset();
        iterator.insertAfter(11);
        iterator.next();
        iterator.deleteCurrent();
        iterator.remove();
        iterator.insertBefore(0);
        displayAll(list);
        System.out.println("-----------");

        iterator = (LinkIterator<Integer>) list.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
            displayAll(list);
            System.out.println("-----------");
        }
    }

    private static void displayAll( LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.println(value);
        }
    }

}
