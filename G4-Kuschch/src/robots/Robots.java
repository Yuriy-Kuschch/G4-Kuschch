package robots;

import java.util.Random;

public class Robots {

    private String name;
    private int health;
    private String damageKeys = "";
    private String alphabet = "QWEASDZXC";

    public Robots(String name) {
        this.health = 100;
        this.name = name;
        for (int i = 0; i < 5; i++) {
            damageKeys = damageKeys + getRandomKey();
        }
        System.out.println();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDamageKeys() {
        return damageKeys;
    }

    public void setDamageKeys(String damageKeys) {
        this.damageKeys = damageKeys;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    char getRandomKey() {
        int randIdx = new Random().nextInt(alphabet.length());
        char randChar = alphabet.charAt(randIdx);
        alphabet = alphabet.replace(String.valueOf(randChar), "");
        return randChar;
    }

    public void executeHit(String letterDamage) {
        setHealth(getHealth() - 20);
        setDamageKeys(getDamageKeys().replaceAll(letterDamage, ""));
    }
}
