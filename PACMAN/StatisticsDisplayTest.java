package PACMAN;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by UI on 06.12.2017.
 */
public class StatisticsDisplayTest {
    public StatisticsDisplayTest() throws Exception {
    }

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);


    @Before
    public void setUp() throws Exception {
        System.setOut(ps);

    }

}




