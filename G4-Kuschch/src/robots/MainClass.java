package robots;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        String letterDamage = "";
        System.out.println(ConsoleWriter.soutEnterName);
        Robots robot1 = new Robots(ConsoleWriter.consoleWriterNameRobot());
        System.out.println(ConsoleWriter.soutEnterName);
        Robots robot2 = new Robots(ConsoleWriter.consoleWriterNameRobot());
        List<Robots> robotsList = new ArrayList<>();
        robotsList.add(robot1);
        robotsList.add(robot2);

        do {
            for (Robots robot : robotsList) {
                ConsoleWriter.mainMenu(robot.getName());
                letterDamage = ConsoleWriter.consoleWriterDamageLetter();
                if (letterDamage.equals("L")) {
                    return;
                }
                if (robot.getDamageKeys().contains(letterDamage)) {
                    robot.executeHit(letterDamage);
                    ConsoleWriter.robotHitTargetMessage(robot.getName());
                    if (robot.getHealth() == 0) {

                        if (robot1.getHealth() == 0) {
                            ConsoleWriter.robotsIndicators(robot2.getName(), robot2.getHealth());
                            ConsoleWriter.lostRobotMessage(robot1.getName());
                        } else {
                            ConsoleWriter.robotsIndicators(robot1.getName(), robot1.getHealth());
                            ConsoleWriter.lostRobotMessage(robot2.getName());
                        }
                        return;
                    }
                } else {
                    ConsoleWriter.robotMissedMessage(robot.getName());
                }
            }
            ConsoleWriter.robotsIndicators(robot1.getName(), robot1.getHealth());
            ConsoleWriter.robotsIndicators(robot2.getName(), robot2.getHealth());
        } while (true);
    }
}