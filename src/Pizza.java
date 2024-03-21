public class Pizza {
    private int price;
    private Boolean veg;


    private int extraCheesePrice=100;
    private int extraToppingsPrice=150;
    private int backPackCharge=50;


    private int basePizzaPrice;

    private  boolean isExtraCheeseAdded= false;
    private  boolean isExtraToppingsAdded= false;
    private boolean isOptedForTakeAway= false;



    public Pizza(Boolean veg) {
        this.veg = veg;

        if (this.veg) {
            price = 300;
        } else {
            price = 500;
        }

        basePizzaPrice= this.price;
    }

    public void extraCheese(){
        isExtraCheeseAdded=true;
        this.price +=extraCheesePrice;
    }

    public void extraToppings(){
        isExtraToppingsAdded=true;
        this.price +=extraToppingsPrice;
    }

    public void takeAway(){
        isOptedForTakeAway=true;
        this.price +=backPackCharge;
    }

    public void getBill(){
        String bill=" ";
        System.out.println("Pizza :"+basePizzaPrice);

        if(isExtraCheeseAdded){
            bill +="Extra cheese added:" +extraCheesePrice + "\n";
        }

        if(isExtraToppingsAdded){
            bill +="Extra Toppings added:" +extraToppingsPrice + "\n";
        }

        if(isOptedForTakeAway){
            bill +="Take Away:" +backPackCharge + "\n";
        }

        bill +="Bill :"+ this.price +"\n";
        System.out.println(bill);
    }
}