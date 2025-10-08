public class WithColdMeats  extends RacletteDecorator {

    public WithColdMeats(Raclette decoratedRaclette) {
        super(decoratedRaclette);
    }

    public int getCalories(){
        return super.getCalories()+350;
    }

    public String getIngredients() {
        return super.getIngredients()+", charcuterie";
    }
     @Override 
    public String toString() {
        return String.format("%s pour %d calories", this.getIngredients(), this.getCalories());
    }
}