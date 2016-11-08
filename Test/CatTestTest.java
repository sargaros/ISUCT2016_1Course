import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stud_6 on 08.11.16.
 */
public class CatTestTest {
    @Test
    public void summPol() throws Exception {
        CatTest CatT = new CatTest();
        int Result =CatT.Summ(1,2);
        int WriteResult = 3;
        assertEquals(Result,WriteResult);
    }
    @Test
    public void summOyr() throws Exception {
        CatTest CatT = new CatTest();
        int Result =CatT.Summ(-1,2);
        int WriteResult = 1;
        assertEquals(Result,WriteResult);
    }
    @Test
    public void summPiO() throws Exception {
        CatTest CatT = new CatTest();
        int Result =CatT.Summ(-1,-3);
        int WriteResult = -4;
        assertEquals(Result,WriteResult);
    }
    @Test
    public void summNol() throws Exception {
        CatTest CatT = new CatTest();
        int Result =CatT.Summ(-1,1);
        int WriteResult = 0;
        assertEquals(Result,WriteResult);
    }
    @Test
    public void summBig() throws Exception {
        CatTest CatT = new CatTest();
        int Result =CatT.Summ(2147483647,1);
        int WriteResult = 2147483646;
        assertEquals(Result,WriteResult);
    }

}