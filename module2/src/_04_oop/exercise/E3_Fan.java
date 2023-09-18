package _04_oop.exercise;

import com.sun.javafx.scene.control.behavior.SpinnerBehavior;

public class E3_Fan {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setFast();
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);
        System.out.println("Fan1: "+ f1.toString());
        Fan f2 = new Fan();
        f2.setMedium();
        System.out.println("Fan1: "+ f2.toString());

    }
}

class Fan {
    private static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }
   public void setMedium()
   {
       this.speed = MEDIUM;
   }
   public void setFast()
   {
       this.speed = FAST;
   }
   public void setOn(boolean on)
   {
       this.isOn = on;
   }
   public void setRadius(double radius)
   {
       this.radius = radius;
   }
   public void setColor(String color)
   {
       this.color = color;
   }
   public boolean isOn()
   {
       return this.isOn;
   }
   public int getSpeed()
   {
       return this.speed;
   }
   public double getRadius()
   {
       return this.radius;
   }
   public String getColor()
   {
       return this.color;
   }
   public String toString()
   {
       return this.isOn? String.format("Speed:%d, Color:%s, Radius:%.1f (fan is on)",speed,color,radius):String.format(" Color:%s, Radius:%.1f (fan is off)",color,radius);
   }
}
