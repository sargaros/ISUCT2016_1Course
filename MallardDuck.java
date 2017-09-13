/**
 * Created by UI on 13.09.2017.
 */
public class MallardDuck extends Duck {
    public  MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();

    }


    public void display(){
        System.out.print("I'm a real Mallard duck");
    }

}


