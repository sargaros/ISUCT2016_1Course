package er;

/**
 * Created by UI on 20.11.2017.
 */
public class StarbuzzCoffee {
    public static void main (String args[]){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                +"$"+beverage.cost());
    }
}
