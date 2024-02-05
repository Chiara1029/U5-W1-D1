package it.chiarapuleio.exdayone.exercise.entities;

import it.chiarapuleio.exdayone.exercise.abstractClass.SuperMenu;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizza  extends SuperMenu {
    private String description;
    private List<Toppings> toppings;

    public Pizza(String name, int kcal, double price) {
        super(name, kcal, price);
    }

    public Pizza(String name, int kcal, double price, List<Toppings> toppings) {
        super(name, kcal, price);
        this.toppings = toppings;
        this.description = "Tomato, Cheese, ";
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "description=" + description + toppings +
                ", name='" + name + '\'' +
                ", kcal=" + kcal +
                ", price=" + price +
                '}';
    }
}
