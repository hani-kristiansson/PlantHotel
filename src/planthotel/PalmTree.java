package planthotel;

// arv och interface
public class PalmTree extends Plants {


    public PalmTree(String name, double height) {
        super(name, height);
    }

    private static final double liquidPerMeter = 0.5;
    private static final String unit = " liter";

    // enums
    @Override
    public String typeOfLiquid() {
        return TypeOfLiquid.TAPWATER.getTypeOfLiquidString();
    }

    @Override
    public String amountOfLiquid() {
        return (this.getHeight() * liquidPerMeter) + unit;
    }
}

