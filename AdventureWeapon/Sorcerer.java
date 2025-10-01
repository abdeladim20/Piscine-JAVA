
public class Sorcerer extends Character implements Healer {

    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    public int getHealCapacity() {
        return healCapacity;
    }

    public void heal(Character character) {
        character.setCurrentHealth(getCurrentHealth() + this.healCapacity);
    }

    @Override
    public void attack(Character character) {
        character.takeDamage(this.getWeapon().getDamage());
    }

    @Override
    public void takeDamage(int damage) {
        if (this.getCurrentHealth() - damage >= 0) {
            this.setCurrentHealth(getCurrentHealth() - damage);
        } else {
            this.setCurrentHealth(0);
        }
    }

    @Override
    public String toString() {
        String baseString;
        if (this.getCurrentHealth() > 0) {
            baseString = String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(), getHealCapacity());
        } else {
            baseString = String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(), this.getHealCapacity());
        }
        return baseString + " He has the weapon " + this.getWeapon().toString() + ".";
    }

}
