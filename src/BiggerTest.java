import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BiggerTest {

    @Test
    public void getBigger() {
        Bigger bigger = new Bigger();
        int first=3;
        int second=4;
        int expecting = 4;
        Assert.assertEquals(bigger.getBigger(first,second),expecting);
    }
}