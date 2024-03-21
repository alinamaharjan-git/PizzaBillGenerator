public class DeluxPizza extends Pizza{


    public DeluxPizza(Boolean veg) {
        super(veg);
        super.extraCheese();
        super.extraToppings();


    }
    @Override
    public void takeAway() {
    }

    @Override
    public void extraToppings() {
    }

    @Override
    public void extraCheese() {
    }
}
