package com.company;

public class Computer {
    private int screen = 2;
    private String graphicsCard;

    public Computer(String graphicsCard, int screen) {
        this.graphicsCard = graphicsCard;
        this.screen = screen;
    }
    public int getScreen() {
        return screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "screen=" + screen +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
