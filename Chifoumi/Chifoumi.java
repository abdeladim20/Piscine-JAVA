
public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        // your code here
        ChifoumiAction Action = switch (chifoumiAction) {
            case ROCK -> chifoumiAction.SCISSOR;
            case SCISSOR -> chifoumiAction.PAPER;
            case PAPER -> chifoumiAction.ROCK;
        };
        return Action;
    }
}

/*
 * ROCK will return SCISSOR
 * 
 * PAPER will return ROCK
 * 
 * SCISSOR will return PAPER
 */