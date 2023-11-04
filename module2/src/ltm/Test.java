package ltm;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();

        hs.add("Computer");
        hs.add("Programming");
        hs.add("Computer");
        hs.add("Networks");
        hs.add("Network");
        hs.add("Security");

        Set<String> is = new TreeSet<String>(hs);
        System.out.println(is);




    }
    public static java.util.LinkedList<String> join_two_linked_lists (java.util.LinkedList<String> linkedList1, java.util.LinkedList<String> linkedList2) {
        java.util.LinkedList<String> result = new java.util.LinkedList<>(linkedList1); // Create a copy of linkedList1

        result.addAll(linkedList2); // Add all elements from linkedList2 to the result list

        return result; // Return the concatenated list
    }

    public static <E> void insert_first_and_last_position (java.util.LinkedList<E> linkedList, E firstElement, E lastElement) {
        //Your code here
        linkedList.addFirst(firstElement);
        linkedList.addLast(lastElement);
    }


    public static void sort_ascending (java.util.ArrayList<Integer> arrayList) {
        //Your code here
        int n = arrayList.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arrayList.get(j)> arrayList.get(j+1))
                {
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                }
            }

        }
    }
    public static void compare_two_linked_lists (java.util.LinkedList<String> list1, java.util.LinkedList<String> list2) {
        LinkedList<String> result = new LinkedList<>();

        // Ensure both lists have the same length
        int minLength = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minLength; i++) {
            if (list1.get(i).equals(list2.get(i))) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }

        // If one list is longer than the other, fill the result with "No"
        int maxLength = Math.max(list1.size(), list2.size());
        for (int i = minLength; i < maxLength; i++) {
            result.add("No");
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

}
