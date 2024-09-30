package planthotel;

public class PalmTree extends Plants implements ICalculateLiquid {


    public PalmTree(String name, double height) {
        super(name, height);
    }

    @Override
    public String typeOfLiquid() {
        return TypeOfLiquid.Kranvatten.name();
    }

    @Override
    public String amountOfLiquid() {
        return Double.toString(this.getHeight()*0.5) + " liter";
    }
    }

