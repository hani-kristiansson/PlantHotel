package planthotel;

// enums
public enum TypeOfLiquid {

    TAPWATER("Tab water"), //tap water
    MINERALWATER("Mineral water"), //mineral water
    PROTEINDRINK("Protein drink"); // protein drink

    private final String typeOfLiquidString;


    TypeOfLiquid(String typeOfLiquidString) {
        this.typeOfLiquidString = typeOfLiquidString;
    }

    public String getTypeOfLiquidString() {
        return typeOfLiquidString;
    }
}
