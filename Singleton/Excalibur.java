class Excalibur{
    private static Excalibur INSTANCE;
    private final String name;

    private Excalibur(String name) {
        this.name = name;
    }
    
    public static Excalibur getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Excalibur("Sword");
        }
        return INSTANCE;
    }

    public String getName() {
        return this.name;
    }

}