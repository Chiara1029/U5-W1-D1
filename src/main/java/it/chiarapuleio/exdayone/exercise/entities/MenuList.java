package it.chiarapuleio.exdayone.exercise.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class MenuList {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Toppings> toppingsList;
}
