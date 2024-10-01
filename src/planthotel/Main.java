package planthotel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private String firstMessage = "Which plant should get liquid? \n(write \"exit\" to finish program)";
    private String finishProgramMessage = "Program ends. Have a good day!";
    private String errorMessage = "There is no matching plant with name \"%s\"";
    private String exitProgramMessage ="exit";
    //private String infoPrintOutMessage = plant.typeOfLiquid() + " " + plant.amountOfLiquid();

    /*
   cactus xx needs this type of water and this amount of liquid per day
     */

    public Main() {
        // polymorfism
        Plants laura = new PalmTree("Laura", 5);
        Plants olof = new PalmTree("Olof", 1);
        Plants igge = new Cactus("Igge", 0.2);
        Plants meatloaf = new CarnivorousPlant("Meatloaf", 0.7);

        // List med polymorfism. Att använda superklass som datatyp i lista för att spara data från subklasser
        List<Plants> plantsInTheHotel = new ArrayList<>();
        plantsInTheHotel.add(igge);
        plantsInTheHotel.add(meatloaf);
        plantsInTheHotel.add(olof);
        plantsInTheHotel.add(laura);

        while (true) {
            String message = JOptionPane.showInputDialog
                    (firstMessage);

            if (message == null || message.equalsIgnoreCase(exitProgramMessage)) {
                JOptionPane.showMessageDialog(null, finishProgramMessage);
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
                        (null, errorMessage.formatted(message));
            }
        }
    }

    private static String getLiquidInfo(ICalculateLiquid plant) {
        return plant.typeOfLiquid() + " " + plant.amountOfLiquid();

        // plant xx needs this type of water and this amount of liquid per day
    }

    public static void main(String[] args) {

        Main main = new Main();
    }
}