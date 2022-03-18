package codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    public void bynaryGapy() {
        var expected = 5;
        var input = 1041;
        var result = Result.bynaryGapy(input);
        assertEquals(expected, result);
    }

    @Test
    public void stringDescribe() {
        var expected = "digit";
        var input = 1;
        var result = Result.stringDescribe(String.valueOf(input));
        assertEquals(expected, result);
    }

    @Test
    public void longestPassword() {
        var expected = 7;
        var input = "test 5 a0A pass007 ?xy1";
        var result = Result.longestPassword(input);
        assertEquals(expected, result);
    }
}