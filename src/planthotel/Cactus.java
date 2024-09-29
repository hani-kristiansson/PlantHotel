package planthotel;

public class Cactus extends Plants implements ICalculateLiquid {


    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public String typeOfLiquid() {
        return TypeOfLiquid.Mineralvatten.name();
    }

    @Override
    public String amountOfLiquid() {
        return "2cl";
    }
}
