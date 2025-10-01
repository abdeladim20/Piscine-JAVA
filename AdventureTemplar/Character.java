
import java.util.*;

public class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int newHealth) {
        if (newHealth > this.maxHealth) {
            this.currentHealth = this.maxHealth;
        } else if (newHealth < 0) {
            this.currentHealth = 0;
        } else {
            this.currentHealth = newHealth;
        }
    }

    public String getName() {
        return name;
    }

    public Character(String name, int maxHealth) {
        this.currentHealth = maxHealth;
        this.name = name;
        this.maxHealth = maxHealth;
        allCharacters.add(this);
    }

    @Override
    public String toString() {
        if (currentHealth == 0) {
            return String.format("%s : KO", name);
        }
        return String.format("%s : %d/%d", name, currentHealth, maxHealth);
    }

    public void takeDamage(int damage) {
        if (this.currentHealth - damage >= 0) {
            this.currentHealth -= damage;
        } else {
            this.currentHealth = 0;
        }
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }

    public static String printStatus() {
        String dashes = "-".repeat(42);
        if (allCharacters.isEmpty()) {
            return String.format(dashes + "\nNobody's fighting right now !\n" + dashes + "\n");
        }
        String line1 = String.format(dashes + "\n" + "Characters currently fighting :\n");
        String characLine = "";
        for (Character character : allCharacters) {
            characLine += " - " + character + "\n";
        }
        return line1 + characLine + dashes + "\n";
    }

    public static Character fight(Character character1, Character character2) {
        while (character1.currentHealth > 0 && character2.currentHealth > 0) {
            character1.attack(character2);
            if (character2.currentHealth > 0) {
                character2.attack(character1);
            }
        }
        if (character1.currentHealth == 0) {
            return character2;
        }
        return character1;
    }

}
