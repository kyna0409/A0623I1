package _10_dsa_danhsach.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_pra {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("welcome");
        collection.add("to");
        collection.add("DaNang");
        Iterator<String >iterator = collection.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next().toUpperCase()+" ");
        }

    }


}
