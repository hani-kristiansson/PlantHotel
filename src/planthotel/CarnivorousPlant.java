package planthotel;

public class CarnivorousPlant extends Plants implements ICalculateLiquid {

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    @Override
    public String typeOfLiquid() {
        return TypeOfLiquid.Proteindryck.name();
    }

    @Override
    public String amountOfLiquid() {
        return Double.toString(0.1+(this.getHeight()*0.2)) + "liter";
    }
}

