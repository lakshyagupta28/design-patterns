package creational.builder.examples.pizzaBuilder;

import creational.builder.examples.pizzaBuilder.enums.CheeseType;
import creational.builder.examples.pizzaBuilder.enums.CrustType;
import creational.builder.examples.pizzaBuilder.enums.Size;
import creational.builder.examples.pizzaBuilder.enums.Topping;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final Size size;
    private final CrustType crustType;
    private List<Topping> topping;
    private List<CheeseType> cheeseType;
    private boolean extraSauce;
    public Pizza(PizzaBuilder pizzaBuilder)
    {
        this.size=pizzaBuilder.size;
        this.crustType=pizzaBuilder.crustType;
        this.topping=pizzaBuilder.topping;
        this.cheeseType=pizzaBuilder.cheeseType;
        this.extraSauce=pizzaBuilder.extraSauce;
    }
    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", crustType=" + crustType +
                ", topping=" + topping +
                ", cheeseType=" + cheeseType +
                ", extraSauce=" + extraSauce +
                '}';
    }
    public static class PizzaBuilder{
        private final Size size;
        private final CrustType crustType;
        private List<Topping> topping;
        private List<CheeseType> cheeseType;
        private boolean extraSauce;
        public PizzaBuilder(Size size, CrustType crustType)
        {
            this.size=size;
            this.crustType=crustType;
            this.topping=new ArrayList<>();
            this.cheeseType=new ArrayList<>();
            extraSauce=false;
        }
        public PizzaBuilder addTopping(Topping topping){
            this.topping.add(topping);
            return this;
        }
        public PizzaBuilder addCheese(CheeseType cheeseType){
            this.cheeseType.add(cheeseType);
            return this;
        }
        public PizzaBuilder extraSauce(){
            this.extraSauce=true;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }

    }

}

/*
    +----------------------+
              |        Pizza         |
              +----------------------+
              | - size: String       |
              | - crust: String      |
              | - cheese: String     |
              | - toppings: List<>  |
              | - extraSauce: bool   |
              +----------------------+
              | + toString(): String |
              +----------------------+

                        ▲
                        |
        +------------------------------+
        |         PizzaBuilder         |  <<interface>>
        +------------------------------+
        | + setSize(String): Builder   |
        | + setCrust(String): Builder  |
        | + setCheese(String): Builder |
        | + addTopping(String): Builder|
        | + setExtraSauce(boolean): Builder |
        | + build(): Pizza             |
        +------------------------------+
 */
