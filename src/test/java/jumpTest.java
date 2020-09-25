import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.konstantin.obstacles.Obstacles;
import ru.konstantin.obstacles.Wall;
import ru.konstantin.participants.Cat;
import ru.konstantin.participants.Human;
import ru.konstantin.participants.Robot;
import ru.konstantin.participants.Runner;

import java.util.ArrayList;

import static ru.konstantin.Main.jumpOrRun;

public class jumpTest {

    @Test
    void testJump(){
        ArrayList<Cat> cats = getCats();
        ArrayList<Robot> robots = getRobots();
        ArrayList<Human> humans = getHumans();
        ArrayList<Wall> wall = getWalls();
        ArrayList<Boolean> expectedResult = getBooleans();

        ArrayList<Runner> runners = getRunners(cats, robots, humans);

        ArrayList<Obstacles> obstacles = new ArrayList<Obstacles>();
        obstacles.addAll(wall);

        Assertions.assertEquals(expectedResult, jumpOrRun(runners, obstacles));

    }


    private ArrayList<Wall> getWalls() {
        ArrayList<Wall> wall = new ArrayList<Wall>();
        wall.add(new Wall(5));
        wall.add(new Wall(10));
        return wall;
    }

    private ArrayList<Cat> getCats() {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Barsik", 2, 2));
        cats.add(new Cat("Holly", 2, 6));
        cats.add(new Cat("Molly", 5, 11));
        return cats;
    }

    private ArrayList<Human> getHumans() {
        ArrayList<Human> humans = new ArrayList<Human>();
        humans.add(new Human("Pasha", 7, 2));
        humans.add(new Human("Sveta", 7, 6));
        humans.add(new Human("Nina", 7, 11));
        return humans;
    }

    private ArrayList<Robot> getRobots() {
        ArrayList<Robot> robots = new ArrayList<Robot>();
        robots.add(new Robot("R2D2", 7, 2));
        robots.add(new Robot("R2D3", 7, 6));
        robots.add(new Robot("R2D4", 7, 11));
        return robots;
    }

    private ArrayList<Runner> getRunners(ArrayList<Cat> cats, ArrayList<Robot> robots, ArrayList<Human> humans) {
        ArrayList<Runner> runners = new ArrayList<Runner>();
        runners.addAll(cats);
        runners.addAll(robots);
        runners.addAll(humans);
        return runners;
    }

    private ArrayList<Boolean> getBooleans() {
        ArrayList<Boolean> expectedResult = new ArrayList<Boolean>();
        expectedResult.add(false);
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(true);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(false);
        expectedResult.add(true);
        return expectedResult;
    }
}


