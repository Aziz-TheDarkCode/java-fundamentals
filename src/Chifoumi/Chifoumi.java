package Chifoumi;

public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        return switch (chifoumiAction) {
            case ROCK -> ChifoumiAction.PAPER;
            case SCISSOR -> ChifoumiAction.ROCK;
            case PAPER -> ChifoumiAction.SCISSOR;
        };
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
