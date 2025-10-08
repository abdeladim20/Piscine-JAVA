
class WithPickles extends RacletteDecorator {

    public WithPickles(Raclette raclette) {
        super(raclette);
    }

    public int getCalories() {
        return super.getCalories()+ 50;
    }

    public String getIngredients() {
        return super.getIngredients()+ ", cornichons";
    }

    @Override
    public String toString() {
        return String.format("%s pour %d calories", this.getIngredients(), this.getCalories());
    }
}
