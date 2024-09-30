package planthotel;

// arv och interface
public class CarnivorousPlant extends Plants implements ICalculateLiquid {

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    private static final double baseLíquld = 0.1;
    private static final double liquidPerMeter = 0.2;
    private static final String unit = " liter";


    // enums
    @Override
    public String typeOfLiquid() {
        return TypeOfLiquid.Proteindryck.name();
    }

    @Override
    public String amountOfLiquid() {
        return (baseLíquld+(this.getHeight()*liquidPerMeter) + unit);
    }
}

