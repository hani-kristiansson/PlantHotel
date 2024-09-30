package planthotel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // constructor
    public Main() {
        Plants laura = new PalmTree("Laura", 5);
        Plants olof = new PalmTree("Olof", 1);
        Plants igge = new Cactus("Igge", 0.2);
        Plants meatloaf = new CarnivorousPlant("Meatloaf", 0.7);

        // below list belongs/extends to class plants
        List<Plants> plantsInTheHotel = new ArrayList<>();
        plantsInTheHotel.add(igge);
        plantsInTheHotel.add(meatloaf);
        plantsInTheHotel.add(olof);
        plantsInTheHotel.add(laura);

        while (true) {
            String message = JOptionPane.showInputDialog("Vilken växt ska få vätska? \n(skriv \"exit\" för att avsluta)");

            if (message == null || message.equalsIgnoreCase("exit")) {
                JOptionPane.showMessageDialog(null, "Programmet avslutas. Ha en bra dag!");
                break;
            }

            boolean plantFound = false;

            for (Plants p : plantsInTheHotel) {
                if (message.equalsIgnoreCase(p.getName())) {
                    plantFound = true;
                    JOptionPane.showMessageDialog(null, getLiquidInfo((ICalculateLiquid) p));
                    break;
                }
            }
            if (!plantFound) {
                JOptionPane.showMessageDialog
                        (null, "Det finns ingen matchande växt med namnet " + "'" + message + "'");
            }
        }
    }

    private static String getLiquidInfo(ICalculateLiquid plant) {
        return plant.typeOfLiquid() + " " + plant.amountOfLiquid();
    }

    public static void main(String[] args) {

        Main main = new Main();
    }
}