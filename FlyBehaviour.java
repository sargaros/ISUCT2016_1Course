/**
 * Created by UI on 13.09.2017.
 */
public interface FlyBehavior {
    public void fly();
}
public class FlyWithwings implements  FlyBehavior {
    public void Fly(){
        System.out.print("I'm flying!!");
    }

}
public  class FlyNoWay implements FlyBehavior{
        public void fly(){
        System.out.println("I can't fly");

        }
        }