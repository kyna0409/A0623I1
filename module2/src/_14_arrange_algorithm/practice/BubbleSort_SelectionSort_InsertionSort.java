package _14_arrange_algorithm.practice;

public class BubbleSort_SelectionSort_InsertionSort {
//    Xuất phát từ cuối dãy, đổi chỗ các cặp phần tử kế cận để đưa phần tử nhỏ hơn trong cặp phần tử đó về vị trí đầu dãy hiện hành, sau đó sẽ không xét đến nó ở bước tiếp theo
//
//    Ở lần xử lý thứ i có vị trí đầu dãy là i
//
//    Lặp lại xử lý trên cho đến khi không còn cặp phần tử nào để xét
    public static void bubbleSort(int [] array)
    {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = array.length-1; j >i ; j--) {
                if(array[j]<array[j-1])
                {
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }
//    Chọn phần tử nhỏ nhất trong n phần tử ban đầu, đưa phần tử này về vị trí đúng là đầu dãy hiện hành
//    Xem dãy hiện hành chỉ còn n-1 phần tử của dãy ban đầu, bắt đầu từ vị trí thứ 2; lặp lại quá trình trên cho dãy hiện hành... đến khi dãy hiện hành chỉ còn 1 phần tử
    public static void selectionSort(int [] array)
    {
        int min;
        for (int i = 0; i < array.length-1; i++) {
            min=i;
            for (int j = i+1; j <array.length ; j++) {
                if(array[j]<array[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp =array[min];
                array[min]=array[i];
                array[i]=temp;
            }
        }
    }
//    Tìm cách chèn phần tử a[i] vào vị trí thích hợp của đoạn đã được sắp để có dãy mới a[0] , a[1] ,... , a[i-1] trở nên có thứ tự
//    Vị trí này chính là pos thỏa : a[pos-1] <= a[i ]< a[pos] (1 <= pos <= i)
    public static void insertionSort(int [] array)
    {
        int pos,x;
        for (int i = 0; i < array.length; i++) {
            x=array[i];
            pos=i;
            while (pos>0&&x<array[pos-1])
            {
                array[pos]=array[pos-1];
                pos--;
            }
            array[pos]=x;
        }
    }
}
