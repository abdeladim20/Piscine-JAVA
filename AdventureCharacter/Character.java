
public class Character {

    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getName() {
        return name;
    }

    public Character(String name, int maxHealth) {
        this.currentHealth = maxHealth;
        this.name = name;
        this.maxHealth = maxHealth;
    }

    @Override
    public String toString() {
        if (currentHealth == 0) {
            return String.format("%s : KO", name);
        }
        return String.format("%s : %d/%d", name, currentHealth, maxHealth);
    }

    public void takeDamage(int damage) {
        if (currentHealth - damage >= 0) {
            this.currentHealth -= damage;
        } else {
            this.currentHealth = 0;
        }
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }
}