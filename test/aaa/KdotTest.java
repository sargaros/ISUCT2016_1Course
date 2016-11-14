package aaa;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by stud_6 on 14.11.16.
 */
public class KdotTest {
    @Test
    public void checkYourself() throws Exception {
        Kdot kdt = new Kdot();
        ArrayList<String> Kdottest = new ArrayList<String>();
        Kdottest.add("1");
        Kdottest.add("2");
        Kdottest.add("3");
        String userzInput = "3";
        kdt.setLocationCells(Kdottest);
        String result = kdt.checkYourself(userzInput);
        String Testresult = "Попал";
        assertEquals(Testresult, result);
    }


    public void checkYourself() throws Exception {
        Kdot kdt = new Kdot();
        ArrayList<String> Kdottest = new ArrayList<String>();
        Kdottest.add("1");
        String userzInput = "1";
        kdt.setLocationCells(Kdottest);
        String result = kdt.checkYourself(userzInput);
        String Testresult = "Убил";
        assertEquals(Testresult, result);
    }


    public void checkYourself() throws Exception {
        Kdot kdt = new Kdot ();
        ArrayList<String> Kdottest = new ArrayList<String>() ;
        Kdottest.add("1");
        Kdottest.add("2");
        Kdottest.add("3");
        String userzInput = "2";
        String result = kdt.checkYourself(userzInput);
        kdt.setLocationCells(Kdottest);
        String result = kdt.checkYourself(userzInput);
        String Testresult = "Потопил";
        assertEquals(Testresult,result);
    }

}