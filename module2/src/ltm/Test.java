package ltm;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 5, 10, -2};

    }

    public static String[] numToStr(int[] arr) {
        // code here
        String [] x = new String[arr.length];
        for (int i = 0; i < x.length; i++) {
            if(arr[i]<0)
            {
                x[i] = "Dojo";
            }else
            {
                x[i] = String.valueOf(arr[i]);
            }
        }
        return x;


    }
}
