
import java.util.*;

public abstract class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();
    private final Weapon weapon;

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    protected void setCurrentHealth(int newHealth) {
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

    public Character(String name, int maxHealth, Weapon weapon) {
        this.currentHealth = maxHealth;
        this.name = name;
        this.maxHealth = maxHealth;
        allCharacters.add(this);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public String toString() {
        if (currentHealth == 0) {
            return String.format("%s : KO", name);
        }
        return String.format("%s : %d/%d", name, currentHealth, maxHealth);
    }

    public abstract void takeDamage(int damage);

    public abstract void attack(Character character);

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
