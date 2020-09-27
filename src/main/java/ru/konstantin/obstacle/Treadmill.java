package ru.konstantin.obstacle;

import ru.konstantin.participant.Runner;

public class Treadmill implements Obstacle {
    protected int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public boolean isCheck(Runner runner) {
        if (runner.getMaxLength() >= length) {
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " пробежал " + length);
            return true;
        } else {
            System.out.println(runner.getClass().getSimpleName() + " " + runner.getName() + " не пробежал " + length);
            return false;
        }
    }

    public int getLength() {
        return length;
    }
}
