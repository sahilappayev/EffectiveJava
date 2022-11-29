package org.example.item2;

import static org.example.item2.Pizza.Topping.MUSHROOM;
import static org.example.item2.Pizza.Topping.SAUSAGE;

public class BuilderPattern {

    public static void main(String[] args) {

        PizzaMargherita margherita = new PizzaMargherita.Builder(PizzaMargherita.Size.MEDIUM)
                .addTopping(MUSHROOM)
                .addTopping(SAUSAGE)
                .build();

        System.out.println(margherita);

    }

}
