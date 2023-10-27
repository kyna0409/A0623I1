package _11_dsa_stack_queue.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TextCollection {

    public static void main(String[] args) {
        ArrayList collection1 = new ArrayList();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");
        System.out.println(collection1.size());
        Collection collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        System.out.println(collection1.addAll(collection2));
        Collections.sort(collection1,Collections.reverseOrder());// sort
        for (int i = 0; i < collection1.size(); i++) {
            System.out.println(collection1.get(i));
        }
    }


}
