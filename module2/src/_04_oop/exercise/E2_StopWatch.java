package _04_oop.exercise;

import java.util.Arrays;
import java.util.Date;

import static java.lang.Math.floor;
import static java.lang.Math.round;

public class E2_StopWatch {
    static void selectionSort(int [] arr)
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[100000];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=(int)(Math.random()*100+1);
        }
        StopWatch sw = new StopWatch();
        selectionSort(arr);
        sw.stop();
        System.out.println(sw.getElapsedTime());
    }
}
class StopWatch{
    private Date startTime;
    private Date endTime;
    public StopWatch()
    {
       startTime = new Date();
    }
    public void start()
    {
        startTime = new Date();
    }
    public void stop()
    {
        endTime = new Date();
    }
    public long getElapsedTime()
    {

        return endTime.getTime() - startTime.getTime();
        //getTime() lay thao milisecond giây
    }
}
