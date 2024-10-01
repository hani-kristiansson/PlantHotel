package planthotel;

// arv
public class Cactus extends Plants {

    public Cactus(String name, double height) {
        super(name, height);
    }

    // static final : finns bara ett värde för den här växten
    private static final String amountOfLiquidCactus = "0.02 liter";

    // interface method : typeOfLiquid() and amountOfLiquid ()
    // enums : MINERALWATER
    @Override
    public String typeOfLiquid() {
        return TypeOfLiquid.MINERALWATER.getTypeOfLiquidString();
    }

    @Override
    public String amountOfLiquid() {
        return amountOfLiquidCactus;
    }
}
