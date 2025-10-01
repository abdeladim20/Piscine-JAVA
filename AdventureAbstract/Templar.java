
public class Templar extends Character implements Healer, Tank {

    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healcapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healcapacity;
        this.shield = shield;
    }

    public int getHealCapacity() {
        return this.healCapacity;
    }

    public void heal(Character character) {
        int health = character.getCurrentHealth() + this.healCapacity;
        character.setCurrentHealth(Math.min(health, character.getMaxHealth()));
    }

    public int getShield() {
        return this.shield;
    }

    @Override
    public void attack(Character character) {
        heal(this);
        character.takeDamage(6);
    }

    @Override
    public void takeDamage(int damage) {
        int realDamage = damage - shield;
        if (this.getCurrentHealth() - realDamage >= 0) {
           this.setCurrentHealth(getCurrentHealth() - realDamage);
        } else {
            this.setCurrentHealth(0);
        }
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                    getName(), this.getCurrentHealth(), this.healCapacity, this.shield);
        }
        return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",
                this.getName(), this.shield, this.healCapacity);
    }
}
