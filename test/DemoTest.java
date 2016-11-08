import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jskonst on 07.11.16.
 */
public class DemoTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSumm() throws Exception {
        Demo demo = new Demo();
        int result = demo.summ(2,2);
        int expResult = 4;
        assertEquals(expResult, result);
    }

    @Test
    public void testSummOtr() throws Exception {
        Demo demo = new Demo();
        int result = demo.summ(-2,-2);
        int expResult = -4;
        assertEquals(expResult, result);
    }

    @Test
    public void testSummDiffZeroRes() throws Exception {
        Demo demo = new Demo();
        int result = demo.summ(-2,2);
        int expResult = 0;
        assertEquals(expResult, result);
    }


    @Test
    public void testSummDiffNonZeroRes() throws Exception {
        Demo demo = new Demo();
        int result = demo.summ(-2,3);
        int expResult = 1;
        assertEquals(expResult, result);
    }


    @Test
    public void testMul() throws Exception {
        Demo demo = new Demo();
        int result = demo.mul(2,2);
        int expResult = 4;
        assertEquals(expResult, result);
    }


    @Test
    public void testMul2() throws Exception {
        Demo demo = new Demo();
        int result = demo.mul(2,3);
        int expResult = 6;
        assertEquals(expResult, result);
    }

    @Test
    public void testMul3() throws Exception {
        Demo demo = new Demo();
        int result = demo.mul(-2,3);
        int expResult = -6;
        assertEquals(expResult, result);
    }

    @Test
    public void testMul4() throws Exception {
        Demo demo = new Demo();
        int result = demo.mul(-2,-3);
        int expResult = 6;
        assertEquals(expResult, result);
    }
}