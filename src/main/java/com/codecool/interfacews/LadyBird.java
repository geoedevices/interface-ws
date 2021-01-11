package com.codecool.interfacews;

public class LadyBird implements Flying, Feeding, Speaking {

    private String name;
    private boolean isFemale;

    public LadyBird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    @Override
    public void fly() {
        speak("Buzz, Buzz");
    }

    @Override
    public void feed() {
        speak("I love aphid");
    }

    @Override
    public void speak(String messageToSay) {
        System.out.println(messageToSay);
    }

}
