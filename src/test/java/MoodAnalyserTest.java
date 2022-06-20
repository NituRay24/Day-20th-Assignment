import org.junit.Assert;
import org.junit.Test;
import java.util.*;
public class MoodAnalyserTest {

    @Test
    public void givenHappyMood_ShouldReturnHAPPY() throws MoodAnalyserTest {
        MoodAnalyserTest moodAnalyser = new MoodAnalyserTest();
        try {
            String mood = moodAnalyser.moodAnalyse(null);
            Assert Assertions;
            Assertions.assertEquals("HAPPY", mood);
        } catch (NullPointerException e) {
// e.printStackTrace();// technical exception by java
// custom exception
            throw new MoodAnalyserTest("Please enter a valid mood.");
        }
    }
}




