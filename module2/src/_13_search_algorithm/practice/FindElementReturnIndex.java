package _13_search_algorithm.practice;

public class FindElementReturnIndex {
    public static void main(String[] args) {
        int [] array =new int []{1,2,3,4,5,6};
        System.out.println(linearSearch(array,6));

    }
    public static int linearSearch(int [] array, int value){
        int index =-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==value){
                index=i;
            }
        }
        return index;
    }
}
