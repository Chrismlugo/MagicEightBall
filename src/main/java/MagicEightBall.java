import java.util.ArrayList;
import java.util.Collections;

public class MagicEightBall {

    private ArrayList<String> answers;

    public MagicEightBall(ArrayList<String> answers){
        this.answers = answers;
    }

    public void add(String answer){
        answers.add(answer);
    }

    public int getWordCount(){
        return this.answers.size();
    }



    public String getRandomAnswer(){
        Collections.shuffle(answers);
        return answers.get(0);
    }

    public ArrayList<String> getAnswers(){
        return new ArrayList<>(this.answers);
    }
}
