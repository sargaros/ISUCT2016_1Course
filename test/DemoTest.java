import org.junit.Test;

/**
 * Created by stud_6 on 08.11.16.
 */
public class DemoTest {
    @Test
    public void sum() throws Exception {
        Demo demo = new Demo();
        int result = demo.sum(1, 1);
        int expResult = 2;
        assertEquals(expResult, result);
    }

    @Test
    public void testSumOtr() throws Exception {
        Demo demo = new Demo();
        int result = demo.sum(-1, -1);
        int expResult = -2;
        assertEquals(expResult, result);
    }

    @Test
    public void testSumDiffZeroRes() throws Exception {
        Demo demo = new Demo();
        int result = demo.sum(-1, 1);
        int expResult = 0;
        assertEquals(expResult, result);
    }
}
