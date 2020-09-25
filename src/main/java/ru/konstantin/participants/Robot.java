package ru.konstantin.participants;

public class Robot implements Runner{

    protected String name;
    protected double maxRun;
    protected double maxJump;

    public Robot(String name, double maxRun, double maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }


    public String getName() {
        return name;
    }

    public double getMaxLength() {
        return maxRun;
    }

    public double getMaxHeight() {
        return maxJump;
    }

}
