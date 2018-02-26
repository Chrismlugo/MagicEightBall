import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MagicEightBallTest {

    private MagicEightBall magicEightBall;

    @Before
    public void before(){
        ArrayList<String> answers = new ArrayList<>();
        answers.add("Chance would be a fine thing");
        answers.add("the answer is unclear");
        answers.add("yes");
        magicEightBall = new MagicEightBall(answers);
    }

    @Test
    public void canAddAnswer(){
        magicEightBall.add("Not sure...");
        assertEquals(4 , magicEightBall.getWordCount());
    }


    @Test
    public void canGetRandomAnswer(){
         ArrayList results = magicEightBall.getAnswers();
        String randomAnswer = magicEightBall.getRandomAnswer();
        assertTrue(results.contains(randomAnswer));
    }

    @Test
    public void canGetAnswerAtIndex(){
        assertEquals("Chance would be a fine thing", magicEightBall.getAnswerAtIndex(0));
    }


    @Test
    public void canRemoveAnAnswer(){
        magicEightBall.removeAnswer("yes");
        assertEquals(2, magicEightBall.getWordCount());
    }
}
