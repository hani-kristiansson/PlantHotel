package planthotel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // constructor
    public Main() {
        PalmTree laura = new PalmTree("Laura", 5);
        PalmTree olof = new PalmTree("Olof", 1);
        Cactus igge = new Cactus("Igge", 0.2);
        CarnivorousPlant meatloaf = new CarnivorousPlant("Meatloaf", 0.7);

        // below list belongs/extends to class plants
        List<Plants> plantsInTheHotel = new ArrayList<>();
        plantsInTheHotel.add(igge);
        plantsInTheHotel.add(meatloaf);
        plantsInTheHotel.add(olof);
        plantsInTheHotel.add(laura);

        while (true){
            String message = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

            for (Plants p : plantsInTheHotel) {
                if (message.equalsIgnoreCase(p.getName())) {
                    JOptionPane.showMessageDialog(null, getLiquidInfo((ICalculateLiquid) p));
                }
            }
            JOptionPane.showMessageDialog
                    (null, "Det finns ingen matchande växt med namnet " + "'" + message + "'");

        }

    }

    private static String getLiquidInfo(ICalculateLiquid plant) {
        return plant.typeOfLiquid() + " " + plant.amountOfLiquid();
    }

    public static void main(String[] args) {

        Main main = new Main();
    }
}