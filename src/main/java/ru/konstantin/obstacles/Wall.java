package ru.konstantin.obstacles;

import ru.konstantin.participants.Runner;

public class Wall implements Obstacles {

    protected int height;
    public Wall(int height) {
        this.height = height;
    }

    public boolean isCheck(Runner runner) {
        if (runner.getMaxHeight() >= height) {
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " перепрыгнул " + height);
            return true;
        } else {
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " не перепрыгнул " + height);
            return false;
        }
    }

    public int getHeight() {
        return height;
    }

}
