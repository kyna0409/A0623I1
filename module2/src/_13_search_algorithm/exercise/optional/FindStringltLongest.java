package _13_search_algorithm.exercise.optional;

import java.sql.Array;
import java.util.*;

public class FindStringltLongest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

//
//        for (int i = 0; i < string.length(); i++) { //O(n)		//1 Vòng lặp
//            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
//                    list.contains(string.charAt(i))) {
//                list.clear();
//            }
//
//            list.add(string.charAt(i));
//
//            if (list.size() > max.size()) {
//                max.clear();
//                max.addAll(list);
//            }
//        }
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() &&
                    list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }


        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
