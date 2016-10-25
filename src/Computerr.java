/**
 * Created by stud_6 on 17.10.16.
 */
public class Computerr {

    public static void main(String[] args() {
        Computer com = new Computer();
        com.brand = "HDD";
        com.model = "6200";
        com.volume = 100000;
        Computer[] mainchick ;
        mainchick = new Computer[2];
        mainchick[0]=new Computer();
        mainchick[1]=new Computer();
        mainchick[0].volume=6200;
        mainchick[1].volume=6300;
    System.out.println(mainchick[1].volume);
    }
}







