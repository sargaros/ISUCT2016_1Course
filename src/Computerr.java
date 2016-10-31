/**
 * Created by stud_6 on 17.10.16.
 */
public class Computerr {

    public static void main(String[] args) {
        Computer com = new Computer();
        com.setBrand("HDD");
        com.setModel("6200");
        com.setVolume (100000);
        Computer[] mainchick ;
        mainchick = new Computer[2];
        mainchick[0]=new Computer();
        mainchick[1]=new Computer();
        mainchick[0].setVolume(6200);
        mainchick[1].setVolume(6300);
        for (int x=0; x<2; x=x+1) {System.out.println(mainchick[x].getVolume()) ;
    }
}}







