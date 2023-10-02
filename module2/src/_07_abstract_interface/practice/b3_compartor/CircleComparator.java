package _07_abstract_interface.practice.b3_compartor;

import _06_inheritance.practice.hecacdoituonghinhhoc.Circle;

import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CircleComparator implements Comparator<Circle> {


    @Override
    public int compare(Circle o1, Circle o2) {
        if(o1.getRadius()>o2.getRadius())
        {
            return 1;
        } else if (o1.getRadius()<o2.getRadius()) {
            return -1;
        }else
        {
            return 0;
        }
    }
}
