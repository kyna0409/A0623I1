package _02_loop.exercise;

public class E3_Prime100 {
    static boolean check(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
       for(int i=2; i<=100; i++)
       {
           if(check(i))
           {
               System.out.print(i+" ");
           }
       }
    }
}
