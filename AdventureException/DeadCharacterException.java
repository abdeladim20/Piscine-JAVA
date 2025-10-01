
public class DeadCharacterException extends Exception {

    private final Character character;

    public DeadCharacterException(Character character) {
        this.character = character;
    }

    public String getMessage() {
        return String.format("The %s %s is dead.", getClass().getName().toLowerCase(), this.character.getName());
    }
}
