package planthotel;

// arv
public class PalmTree extends Plants {


    public PalmTree(String name, double height) {
        super(name, height);
    }

    private static final double liquidPerMeter = 0.5;
    private static final String unit = " liter";

    // interface method : typeOfLiquid() and amountOfLiquid ()
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

