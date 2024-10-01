package planthotel;

// arv och interface
public class Cactus extends Plants {

    public Cactus(String name, double height) {
        super(name, height);
    }

    private static final String amountOfLiquidCactus = "0.02 liter";

    // enums
    @Override
    public String typeOfLiquid() {
        return TypeOfLiquid.MINERALWATER.getTypeOfLiquidString();
    }

    @Override
    public String amountOfLiquid() {
        return amountOfLiquidCactus;
    }
}
