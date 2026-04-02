public class Main {

    public static void main(String[] args) {
        Burger baseBurger = new Burger(true);
        baseBurger.addExtraToppings();
        baseBurger.takeAway();
        baseBurger.getBill();
        baseBurger.addExtraCheese();
    }
}