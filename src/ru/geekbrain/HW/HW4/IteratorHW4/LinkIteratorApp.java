package ru.geekbrain.HW.HW4.IteratorHW4;

import ru.geekbrain.HW.HW4.SimpleLinkedListImpl;

public class LinkIteratorApp {


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        LinkIterator itr = new LinkIterator(list);

        itr.insertAfter("Vasiy", 20);
        itr.insertBefore("Petiy", 15);
        list.display();
        itr.insertBefore("Glasha", 28);
        itr.insertBefore("Masha", 25);
        list.display();
        itr.insertAfter("Viki", 22);
        list.display();
        System.out.println("deleteCurrent");
        itr.deleteCurrent();
        list.display();
        System.out.println("getCurrent= " +  itr.getCurrent().getClass().getName());
        System.out.println("getIterator= " +  list.getIterator().getClass().getName());
        System.out.println("getFirst" + list.getFirst().getClass().getName());

    }

}
