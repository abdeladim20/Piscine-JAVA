
public class Monster extends Character {

    public Monster(String name, int currentHealth) {
        super(name, currentHealth);
    }

    @Override
    public void attack(Character character) {
        character.takeDamage(7);
    }

    @Override
    public void takeDamage(int damage) {
        int realDamage = (int)Math.floor((damage * 80 / 100));
        if (this.getCurrentHealth() - realDamage >= 0) {
            this.setCurrentHealth(getCurrentHealth() - realDamage);
        } else {
            this.setCurrentHealth(0);
        }
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() > 0) {
            return String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth());
        }
        return String.format("%s is a monster and is dead", this.getName());
    }

}
