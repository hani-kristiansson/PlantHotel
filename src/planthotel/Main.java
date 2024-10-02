package planthotel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private String firstMessage = "Which plant should get liquid? \n(write \"exit\" to finish program)";
    private String finishProgramMessage = "Program ends. Have a good day!";
    private String errorMessage = "There is no matching plant with name \"%s\"";
    private String printOutAmountAndTypeOfLiquid = "%s needs %s of %s per day";
    //Igge needs 0.02 liters of mineral water per day.

    public Main() {
        // polymorfism : datatyp och object typ är olika
        // datatyp är superklass plants men object typ är subklass. datatyp som styr vilka object metoder man kan använda
        // att förenkla koden och hantera olika object typer som en datatyp
        Plants laura = new PalmTree("Laura", 5);
        Plants olof = new PalmTree("Olof", 1);
        Plants igge = new Cactus("Igge", 0.2);
        Plants meatloaf = new CarnivorousPlant("Meatloaf", 0.7);

        // List med polymorfism. Att använda superklass som datatyp i lista för att spara data från subklasser
        // datatyp i list är superklass. men objekt typ är subklasser
        List<Plants> plantsListInTheHotel = new ArrayList<>();
        plantsListInTheHotel.add(igge);
        plantsListInTheHotel.add(meatloaf);
        plantsListInTheHotel.add(olof);
        plantsListInTheHotel.add(laura);

        // programmet körs!
        while (true) {
            String message = JOptionPane.showInputDialog
                    (firstMessage);

            if (message == null || message.equalsIgnoreCase("exit")) {
                JOptionPane.showMessageDialog(null, finishProgramMessage);
                break;
            }

            boolean plantFound = false;

            for (Plants p : plantsListInTheHotel) {
                if (message.equalsIgnoreCase(p.getName())) {
                    plantFound = true;
                    JOptionPane.showMessageDialog(null, getLiquidInfo(p));
                    break;
                }
            }
            if (!plantFound) {
                JOptionPane.showMessageDialog
                        (null, errorMessage.formatted(message));
            }
        }
    }
    //method att skapa mängd av vätska. om det finns matchande method i subklass först, sen kollar superklassen
    //polymorfism
    private String getLiquidInfo(Plants plant) {
        return printOutAmountAndTypeOfLiquid.formatted(plant.getName(), plant.amountOfLiquid(), plant.typeOfLiquid());
    }

    //statiska main method att anropa huvudkonstrutor och köra programmet i en icke statisk kontext
    public static void main(String[] args) {

        Main main = new Main();
    }
}