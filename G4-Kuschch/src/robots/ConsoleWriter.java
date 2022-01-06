package robots;

import java.util.Scanner;

public class ConsoleWriter {

    public static String keys = "QWEASDZXCL";
    public static String soutEnterName = "Enter robot name: ";
    public static String closeProgramButton = "L";

    public static String consoleWriterNameRobot() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String consoleWriterDamageLetter() {

        Scanner scanner = new Scanner(System.in);
        String letterDamage = scanner.next().toUpperCase().substring(0, 1);

        if (letterDamage.equals(closeProgramButton)) {
            System.out.println("Closing the program --- goodbye! --- ");
        }
        if (letterDamage.length() > 1) {
            System.out.println("You entered more than one letter, the first is accepted: " + ("\"") +
                    letterDamage + ("\""));
        }
        if (!keys.contains(letterDamage)) {
            System.out.println("Wrong enters. Use only one key from " + keys + " keys");
        }
        return letterDamage;
    }

    public static void mainMenu(String getName) {
        System.out.println("Для выхода из программы введите букву \"L\""
                + "\n" + "Выстрел по роботу: " + getName +
                "\n" + "Your step: press key (" + keys + ")");
    }

    public static void lostRobotMessage(String name) {
        System.out.println("The robot '" + name + "' lost");
    }

    public static void robotHitTargetMessage(String name) {
        System.out.println("- robot hit the target " + name + " -20 health");
    }

    public static void robotMissedMessage(String name) {
        System.out.println("robot missed: " + name);
    }

    public static void robotsIndicators(String name, int health) {
        System.out.println("~~~~~~~~" + "\n" + name + " - " + health + "\n" + "~~~~~~~~");
    }
}