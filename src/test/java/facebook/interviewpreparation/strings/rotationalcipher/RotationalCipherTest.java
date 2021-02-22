package facebook.interviewpreparation.strings.rotationalcipher;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RotationalCipherTest {

    @Test
    public void testRotationalCipherOne() {
        String expectedCipher = "Epp-gsrzsCw-3-fi:Epivx5.";

        String inputString = "All-convoYs-9-be:Alert1.";
        int rotationFactor = 4;
        RotationalCipher rotationalCipher = new RotationalCipher();
        String actualCipher = rotationalCipher.rotationalCipher(inputString, rotationFactor);

        Assert.assertEquals(expectedCipher, actualCipher);
    }

    @Test
    public void testRotationalCipherTwo() {
        String expectedCipher = "stuvRPQrpq-999.@";

        String inputString = "abcdZXYzxy-999.@";
        int rotationFactor = 200;
        RotationalCipher rotationalCipher = new RotationalCipher();
        String actualCipher = rotationalCipher.rotationalCipher(inputString, rotationFactor);

        Assert.assertEquals(expectedCipher, actualCipher);
    }

}
