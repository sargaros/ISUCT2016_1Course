/**
 * Created by UI on 13.09.2017.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBeaviour quackBeavior;
    public  Duck() {
        public abstract  void display();
        public void performFly() {
            flyBehavior.fly();

        }
        public void performQuack() {
        quackBeavior.quack();

    }
        public void swim(){
            System.out.print("All ducks,even decoys!");
        }
    }

