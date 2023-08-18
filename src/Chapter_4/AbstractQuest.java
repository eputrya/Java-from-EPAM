package Chapter_4;
import java.util.Random;

public abstract class AbstractQuest {
    private long questId;
    private String content;
    // constructors, methods
    public abstract boolean check(Answer answer);
}

class DragnDropQuest extends AbstractQuest {
    // constructors, methods
    @Override
    public boolean check(Answer answer) {
        return new Random().nextBoolean(); // demo
    }
}

class SingleChoiceQuest extends AbstractQuest {
    // constructors, methods
    @Override
    public boolean check(Answer answer) {
        return new Random().nextBoolean();
    }
}

class Answer {
    // fields, constructors, methods
}

class QuestFactory { // pattern Factory Method (simplest)
    public static AbstractQuest getQuestFromFactory(int mode) {
        switch (mode) {
            case 0:
                return new DragnDropQuest();
            case 1:
                return new SingleChoiceQuest();
            default:
                throw new IllegalArgumentException("illegal mode");
                // assert false; // bad
                // return null; // ugly
        }
    }
}

class TestGenerator {
    public AbstractQuest[] generateTest(final int NUMBER_QUESTS, int maxMode) {
        AbstractQuest[] test = new AbstractQuest[NUMBER_QUESTS];
        for (int i = 0; i < test.length; i++) {
            int mode = new Random().nextInt(maxMode); // stub
            test[i] = QuestFactory.getQuestFromFactory(mode);
        }
        return test;
    }
}

class TestAction {
    public int checkTest(AbstractQuest[] test) {
        int counter = 0;
        for (AbstractQuest s : test) {
            // вызов полиморфного метода
            counter = s.check(new Answer()) ? ++counter : counter;
        }
        return counter;
    }
}

class QuizMain {
    public static void main(String[] args) {
        TestGenerator generator = new TestGenerator();
        AbstractQuest[] test = generator.generateTest(60, 2); // 60 questions of 2 types
        // here should be the code of the test process …
        TestAction action = new TestAction();
        int result = action.checkTest(test);
        System.out.println(result + " correct answers, " + (60 - result) + " incorrect");
    }
}
