package _07_abstract_interface.practice.b1.animal;

import _07_abstract_interface.practice.b1.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[]animals= new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals) {
           if(animal instanceof Chicken)
           {
               //animal.makeSound();
               Edible edible = (Chicken) animal;
               System.out.println(edible.howToEat());
           }
        }
    }
}
