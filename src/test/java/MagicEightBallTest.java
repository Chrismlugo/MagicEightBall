import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class MagicEightBalltest {

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
    public void canAddAnswers(){

    }
}
