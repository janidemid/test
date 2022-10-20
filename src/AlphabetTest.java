import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetTest {

    @Test
    public void isAlphabet() {
        Alphabet alphabet = new Alphabet();
        boolean expecting=false;
        Assert.assertEquals(alphabet.isAlphabet("abcf"),expecting);
    }
}