package com.practice.idealo.toyrobot;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        //String inputString = "PLACE 0,0,NORTH\nMOVE\nREPORT"; // O/P ==> Report{x=0, y=1, facing=NORTH}
        String inputString = "MOVE\nMOVE\nLEFT\nPLACE 1,2,EAST\nMOVE\nmove\nLEFT\nMOVE\nREPORT"; // O/P ==> Report{x=3, y=3, facing=NORTH}
        String[] lines = inputString.split("\n");
        ToyRobot toyRobot = new ToyRobot(5, 5);
        List<String> validLinesToParse = getValidCommands(lines);

        validLinesToParse.forEach(validLine -> {
            if (validLine.contains("PLACE")) {
                int placeIndex = validLine.indexOf("PLACE") + 5;
                String indexAndFacingString = validLine.substring(placeIndex).trim();
                String[] indexAndFacingSplits = indexAndFacingString.split(",");
                String x = indexAndFacingSplits[0];
                String y = indexAndFacingSplits[1];
                String facing = indexAndFacingSplits[2];
                toyRobot.place(Integer.parseInt(x), Integer.parseInt(y), Facing.valueOf(facing));
            } else if (validLine.contains("MOVE")) {
                Facing facing = toyRobot.getFacing();
                toyRobot.move(facing);
            } else if (validLine.contains("LEFT")) {
                turnLeft(toyRobot);
            } else if (validLine.contains("RIGHT")) {
                turnRight(toyRobot);
            } else if (validLine.contains("REPORT")) {
                Report reportData = toyRobot.report();
                System.out.println("reportData ===> "+reportData);
            } else {
                System.out.println("Cannot parse input "+validLine);
            }
        });
    }

    private static void turnRight(ToyRobot toyRobot) {
        Facing facing = toyRobot.getFacing();
        Facing newFacing = toyRobot.turnRight(facing);
        toyRobot.setFacing(newFacing);
    }

    private static void turnLeft(ToyRobot toyRobot) {
        Facing facing = toyRobot.getFacing();
        Facing newFacing = toyRobot.turnLeft(facing);
        toyRobot.setFacing(newFacing);
    }

    @NotNull
    private static List<String> getValidCommands(String[] lines) {
        List<String> validLinesToParse = new ArrayList<>();
        int validStartLineIndex = 0;
        for (int i=0;i<lines.length;i++) {
            String line = lines[i];
            if (line.startsWith("PLACE")) {
                validStartLineIndex = i;
                break;
            }
        }

        for (int j=validStartLineIndex; j<lines.length;j++) {
            String line = lines[j];
            validLinesToParse.add(line);
        }
        return validLinesToParse;
    }
}
