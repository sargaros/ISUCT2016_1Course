package Dot;

import org.junit.Test;

import javax.xml.transform.Result;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by stud_6 on 14.11.16.
 */
public class DotComTest {
    @Test
    public void checkYouself() throws Exception {
        DotCom dot = new DotCom();
        ArrayList<String> locTest = new ArrayList<String>();
        locTest.add("1");
        locTest.add("2");
        locTest.add("3");
        String userInput = "2";
        dot.setLocationCells(locTest);
        String result=dot.checkYouself(userInput);
        String TestResult = "Попал";
        assertEquals(TestResult,result);
    }
    @Test
    public void checkYouselfLose() throws Exception {
        DotCom dot = new DotCom();
        ArrayList<String> locTest = new ArrayList<String>();
        locTest.add("1");
        locTest.add("2");
        locTest.add("3");
        String userInput = "5";
        dot.setLocationCells(locTest);
        String result=dot.checkYouself(userInput);
        String TestResult = "Мимо";
        assertEquals(TestResult,result);
    }
    @Test
    public void checkYouself1Kill() throws Exception {
        DotCom dot = new DotCom();
        ArrayList<String> locTest = new ArrayList<String>();
        locTest.add("2");
        String userInput = "2";
        dot.setLocationCells(locTest);
        String result=dot.checkYouself(userInput);
        String TestResult = "Убил";
        assertEquals(TestResult,result);

    }
    @Test
    public void checkYouself3Kill() throws Exception {
        DotCom dot = new DotCom();
        ArrayList<String> locTest = new ArrayList<String>();
        locTest.add("1");
        locTest.add("2");
        locTest.add("3");
        String userInput = "2";
        dot.setLocationCells(locTest);
        dot.checkYouself(userInput);
        userInput="3";
        dot.checkYouself(userInput);
        userInput="1";
        String result=dot.checkYouself(userInput);
        String TestResult = "Потопил";
        assertEquals(TestResult,result);

    }

}