
public class Templar extends Character implements Healer, Tank {

    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healcapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
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
        character.takeDamage(this.getWeapon().getDamage());
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
        String baseString;
        if (this.getCurrentHealth() > 0) {
            baseString = String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                    getName(), this.getCurrentHealth(), this.getHealCapacity(), this.getShield());
        } else {
            baseString = String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",
                    this.getName(), this.getShield(), this.getHealCapacity());
        }
        return baseString + " He has the weapon " + this.getWeapon().toString() + ".";
    }
}
