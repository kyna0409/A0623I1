package _03_array_method.practice.multidimensional_array;

public class SwapArray {
    public static void main(String[] args) {
        int a[][] = new int [3][3];
        System.out.println("Enter " + a.length + " rows and " + a[0].length + " columns: ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length;j++)
            {
                // a[i][j]=sc.nextInt();
                a[i][j]= (int)(Math.random()*100+1);// nhập giá trị ngẫu nhiên từ 1 đến 100
            }
        }
        System.out.println("mảng ban đầu là");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length;j++)
            {
                System.out.println("a["+i+"]["+j+"]="+a[i][j]);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                int i1 = (int) (Math.random() * a.length);
                int j1 = (int) (Math.random() * a[i].length);

                // Swap matrix[i][j] with matrix[i1][j1]
                int temp = a[i][j];
                a[i][j] = a[i1][j1];
                a[i1][j1] = temp;
            }
        }
        System.out.println("mang sau khi trao phan tu");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length;j++)
            {
                System.out.println("a["+i+"]["+j+"]="+a[i][j]);
            }
        }
    }
}
