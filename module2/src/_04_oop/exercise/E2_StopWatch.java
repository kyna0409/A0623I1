package _04_oop.exercise;

import java.util.Arrays;
import java.util.Date;

import static java.lang.Math.floor;

public class E2_StopWatch {
    public static void main(String[] args) {

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
    public void getElapsedTime()
    {

    }
}
