package planthotel;

// arv
public class CarnivorousPlant extends Plants {

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    private static final double baseLiquid = 0.1;
    private static final double liquidPerMeter = 0.2;
    private static final String unit = " liter";

    // interface method : typeOfLiquid() and amountOfLiquid ()
    // enums
    @Override
    public String typeOfLiquid() {
        return TypeOfLiquid.PROTEINDRINK.getTypeOfLiquidString();
    }

    @Override
    public String amountOfLiquid() {
        return (baseLiquid+(this.getHeight()*liquidPerMeter) + unit);
    }
}

