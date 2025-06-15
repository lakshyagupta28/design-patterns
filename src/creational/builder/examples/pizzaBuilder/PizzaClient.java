package creational.builder.examples.pizzaBuilder;

import creational.builder.examples.pizzaBuilder.enums.CheeseType;
import creational.builder.examples.pizzaBuilder.enums.CrustType;
import creational.builder.examples.pizzaBuilder.enums.Size;
import creational.builder.examples.pizzaBuilder.enums.Topping;

public class PizzaClient {
    public static void main(String[] args) {
        Pizza pizza= new Pizza.PizzaBuilder(Size.LARGE, CrustType.CHEESE_BURST).
                addCheese(CheeseType.PARMESAN).
                addCheese(CheeseType.REGGIANO).
                addTopping(Topping.ONION).
                addTopping(Topping.PEPPER).
                build();
        System.out.println(pizza);
    }
}
