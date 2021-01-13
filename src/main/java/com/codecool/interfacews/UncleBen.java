package com.codecool.interfacews;


import java.util.List;

public class UncleBen {

    public static void feedBirds(List<Bird> myBirds) {
        for (Bird actualBird : myBirds) {
            actualBird.feed();
        }
    }

}
