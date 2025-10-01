
public class Monster extends Character {

    public Monster(String name, int currentHealth, Weapon weapon) {
        super(name, currentHealth, weapon);
    }

    @Override
    public void attack(Character character) {
        character.takeDamage(this.getWeapon().getDamage());
    }

    @Override
    public void takeDamage(int damage) {
        int realDamage = (int) Math.floor((damage * 80 / 100));
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
            baseString = String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth());
        } else {
            baseString = String.format("%s is a monster and is dead", this.getName());
        }
        return baseString + ". He has the weapon " + this.getWeapon().toString() + ".";
    }

}
