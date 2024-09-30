package planthotel;

// arv och interface
public class Cactus extends Plants implements ICalculateLiquid {

    public Cactus(String name, double height) {
        super(name, height);
    }

    private static final String amountOfLiquidCactus = "2 cl";

    // enums
    @Override
    public String typeOfLiquid() {
        return TypeOfLiquid.Mineralvatten.name();
    }

    @Override
    public String amountOfLiquid() {
        return amountOfLiquidCactus;
    }
}
