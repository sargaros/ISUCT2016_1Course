import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by stud_6 on 08.11.16.
 */
public class RabbitTestTest {
    @Test
    public void summ() throws Exception {

    }

    @Test
    public void summ1() throws Exception {
        RabbitTest rabbit = new RabbitTest();
        int result = rabbit.summ(2,2);
        int expResult = 4;
        assertEquals(expResult, result);
    }
    @Test
    public void testSummOtr() throws Exception {
        RabbitTest rabbit = new RabbitTest();
        int result = rabbit.summ(-2, -2);
        int expResult = -4;
        assertEquals(expResult, result);
    }
    @Test
    public void testSummDiffZeroRes() throws Exception {
        RabbitTest rabbit = new RabbitTest ();
        int result = rabbit.summ(-2, 2);
        int expResult = 0;
//        assertEquals(expResult, result);
    }
    @Test
    public void testSummDiffNonZeroRes() throws Exception {
        RabbitTest rabbit = new RabbitTest();
        int result = rabbit.summ(-2, 3);
        int expResult = 1;
//        assertEquals(expResult, result);
    }
}  