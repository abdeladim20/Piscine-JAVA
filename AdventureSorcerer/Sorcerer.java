
public class Sorcerer extends Character implements Healer {

    private int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    public int getHealCapacity() {
        return healCapacity;
    }

    public void heal(Character character) {
        character.setCurrentHealth(this.healCapacity);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(), getHealCapacity());
        }
        return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(), this.healCapacity);
    }

}
