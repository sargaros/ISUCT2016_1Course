package gggg;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by stud_6 on 14.11.16.
 */
public class KdotTest {
    @Test
    public void checkYourself() throws Exception {
        Kdot kd = new Kdot();
        ArrayList<String> KdotTest = new ArrayList<String>();
        KdotTest.add("1");
        KdotTest.add("2");
        KdotTest.add("3");
        String userInput = "2";
        kd.setLocationCells(KdotTest);
        String result = kd.checkYourself(userInput);
        String Testresult = "Попал";
        assertEquals(Testresult, result);
    }


    @Test
    public void checkYourselfKill() throws Exception {
        Kdot kd = new Kdot();
        ArrayList<String> KdotTest = new ArrayList<String>();
        KdotTest.add("3");
        String userInput = "3";
        kd.setLocationCells(KdotTest);
        String result = kd.checkYourself(userInput);
        String Testresult = "Убил";
        assertEquals(Testresult, result);
    }

    @Test
    public void checkYourselfFill() throws Exception {
        Kdot kd = new Kdot();
        ArrayList<String> KdotTest = new ArrayList<String>();
        KdotTest.add("1");
        KdotTest.add("2");
        KdotTest.add("3");
        String userInput = "3";
        String result = kd.checkYourself(userInput);
        kd.setLocationCells(KdotTest);
        userInput = "2";
        String result = kd.checkYourself(userInput);
        userInput = "1";
        String Testresult = "Потопил";
        assertEquals(Testresult, result);
    }


}

}