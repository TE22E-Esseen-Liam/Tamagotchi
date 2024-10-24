package Tamagochi;

import java.util.Scanner;

public class TamgochiMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Tamagochi game");
        Scanner myScan = new Scanner(System.in);

        Tamagotchi theTam = new Tamagotchi();

        System.out.println("Please choose a name for your Tamagotchi!");
        theTam.name = myScan.nextLine();

        System.out.println("Great! " + theTam.name + " is a beautiful name!");

        while (theTam.getAlive() == true) {
            theTam.printStats();
            System.out.println("Now what do you want to do?");
            System.out.println("1. Teach " + theTam.name + " a new word");
            System.out.println("2. Talk to " + theTam.name);
            System.out.println("3. Feed " + theTam.name);
            System.out.println("4. Do nothing");

            String doWhat = myScan.nextLine();
            if (doWhat == "1") {
                System.out.println("What word?");
                String word = myScan.nextLine();
                theTam.teach(word);
            }
            if (doWhat == "2") {
                theTam.speak();
            }
            if (doWhat == "3") {
                theTam.feed();
            } else {
                System.out.println("Doing nothing...");
            }
            theTam.tick();
            System.out.println("Press Enter to continue");
            myScan.nextLine();
        }

        System.out.println("OH NO! " + theTam.name + " is dead!");
        System.out.println("Press ENTER to quit");
        myScan.nextLine();
    }
}


// @author LivNTI