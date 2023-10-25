package ltm;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

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

}
