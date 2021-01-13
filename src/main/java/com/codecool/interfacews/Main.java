package com.codecool.interfacews;

import java.util.ArrayList;
import java.util.List;
import static com.codecool.interfacews.UncleBen.*;

public class Main {

    public static void main(String[] args) {

        List<Bird> myBirds = new ArrayList<>();
        myBirds.add(new Bird("Tuki", true));
        myBirds.add(new Bird("Sunny", false));
//        myBirds.add(new LadyBird("Charlie", false));
//        myBirds.add(new LadyBird("Angel", true));
        feedBirds(myBirds);

    }
}
