package ru.konstantin;

import ru.konstantin.obstacles.Obstacles;
import ru.konstantin.participants.Runner;

import java.util.ArrayList;

public class Main {

    public static ArrayList jumpOrRun(ArrayList<Runner> runners, ArrayList<Obstacles> obstacles) {
        ArrayList<Boolean> actualResult = new ArrayList<Boolean>();

        for(Obstacles obstacle : obstacles) {
            for (Runner runner : runners) {
                actualResult.add(obstacle.isCheck(runner));
            }
        }

        return actualResult;
    }

}
