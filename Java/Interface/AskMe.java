package Interface;
import java.util.Random;

// Interface holding constants
interface ResponseConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

// Class generating random responses using constants
class Question implements ResponseConstants {
    Random rand = new Random();

    int ask() {
        int value = (int)(100 * rand.nextDouble());

        if (value < 30) return NO;
        else if (value < 60) return YES;
        else if (value < 75) return LATER;
        else if (value < 98) return SOON;
        else return NEVER;
    }
}

// Class to print answers based on constants
class Answerer implements ResponseConstants {
    static void printAnswer(int result) {
        switch(result) {
            case NO: System.out.println("No"); break;
            case YES: System.out.println("Yes"); break;
            case MAYBE: System.out.println("Maybe"); break;
            case LATER: System.out.println("Later"); break;
            case SOON: System.out.println("Soon"); break;
            case NEVER: System.out.println("Never"); break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();

        // Ask 5 random questions and print answers
        for (int i = 0; i < 5; i++) {
            int response = q.ask();
            printAnswer(response);
        }
    }
}
