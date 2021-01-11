package com.codecool.interfacews;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bird myBirdOne = new Bird("Tuki", true);
        Bird myBirdTwo = new Bird("Sunny", false);
        LadyBird myLadyBirdOne = new LadyBird("Charlie", false);
        LadyBird myLadyBirdTwo = new LadyBird("Angel", true);
        myBirdOne.fly();
        myBirdTwo.fly();
        myLadyBirdOne.fly();
        myLadyBirdTwo.fly();
        myBirdOne.feed();
        myBirdTwo.feed();
        myLadyBirdOne.feed();
        myLadyBirdTwo.feed();
    }
}
