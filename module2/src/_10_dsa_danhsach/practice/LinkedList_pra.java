package _10_dsa_danhsach.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList_pra {
    public static void main(String[] args) {
        List<String>linkedlist = new LinkedList<>();
        linkedlist.add("thu");
        linkedlist.add("hoa");
        ListIterator<String>listIterator = linkedlist.listIterator();
        while (listIterator.hasNext())
        {
            System.out.print(listIterator.next()+" ");
        }
        //////////////
        for (String e:linkedlist) {
            System.out.println(e+" ");

        }
    }

}
