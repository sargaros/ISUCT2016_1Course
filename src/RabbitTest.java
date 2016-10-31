/**
 * Created by stud_6 on 17.10.16.
 */
public class RabbitTest {
    public static void main(String[] args) {
        Rabbit cam = new Rabbit();
        Rabbit c = new Rabbit();
        Rabbit[] pub;
        pub = new Rabbit[3];
        pub[0] = new Rabbit();
        pub[1] = new Rabbit();
        pub[2] = new Rabbit();
        pub[1].setAge(5);
        System.out.print(pub[1].getAge());
    }
}



