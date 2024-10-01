package planthotel;

// enums
public enum TypeOfLiquid {

    TAPWATER("tab water"),
    MINERALWATER("mineral water"),
    PROTEINDRINK("protein drink");

    private final String typeOfLiquidString;

    TypeOfLiquid(String typeOfLiquidString) {
        this.typeOfLiquidString = typeOfLiquidString;
    }

    public String getTypeOfLiquidString() {
        return typeOfLiquidString;
    }
}
