package Tamagochi;

import java.util.ArrayList;
import java.util.Random;

public class Tamagotchi {
    //attributes
    int hunger;
    private int boredom;
    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive;
    public String name;
    Random rand = new Random();

    //constructor
    public Tamagotchi() {
        isAlive = true;
        words.add("Hallo");
    }

    //methods
    public void feed() {
        System.out.println(name + " eats and becomes less hungry");
        hunger -= 2;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void speak() {
        int wordNum = rand.nextInt(words.size());
        System.out.println(name + " says: " + words.get(wordNum));
        reduceBoredom();
    }

    public void teach(String word) {
        System.out.println(name + " learns: " + word);
        words.add(word);
        reduceBoredom();
    }

    public void tick() {
        hunger++;
        boredom++;
        if (hunger > 10 || boredom > 10) {
            isAlive = false;
        }
    }

    public void printStats() {
        System.out.println("Name: " + name + " || Hunger: " + hunger + " || Boredom: " + boredom + " || Vocabulary: " + words.size() + "words");
    }

    public boolean getAlive() {
        return isAlive;
    }

    public void reduceBoredom() {
        System.out.println(name + " is now less bored!");
        boredom -= 2;
        if (boredom < 0) {
            boredom = 0;
        }
    }
}

