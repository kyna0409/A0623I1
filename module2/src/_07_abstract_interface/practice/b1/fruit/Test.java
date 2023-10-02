package _07_abstract_interface.practice.b1.fruit;

import _07_abstract_interface.practice.b1.edible.Edible;

public class Test {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit:fruits) {
            System.out.print(fruit.howToEat()+" ");
        }
    }
}
