import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.konstantin.obstacles.Obstacles;
import ru.konstantin.obstacles.Treadmill;
import ru.konstantin.obstacles.Wall;
import ru.konstantin.participants.Cat;
import ru.konstantin.participants.Human;
import ru.konstantin.participants.Robot;
import ru.konstantin.participants.Runner;

import java.util.ArrayList;

import static ru.konstantin.Main.jumpOrRun;


public class runTest {

    @Test
    void testRun(){
        ArrayList<Cat> cats = getCats();
        ArrayList<Robot> robots = getRobots();
        ArrayList<Human> humans = getHumans();
        ArrayList<Treadmill> treadmills = getTreadmills();
        ArrayList<Boolean> expectedResult = getBooleans();

        ArrayList<Runner> runners = getRunners(cats, robots, humans);

        ArrayList<Obstacles> obstacles = new ArrayList<Obstacles>();
        obstacles.addAll(treadmills);

        Assertions.assertEquals(expectedResult, jumpOrRun(runners, obstacles));

    }


    private ArrayList<Treadmill> getTreadmills() {
        ArrayList<Treadmill> treadmills = new ArrayList<Treadmill>();
        treadmills.add(new Treadmill(5));
        treadmills.add(new Treadmill(10));
        return treadmills;
    }

    private ArrayList<Cat> getCats() {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Barsik", 2, 0));
        cats.add(new Cat("Holly", 6, 0));
        cats.add(new Cat("Molly", 11, 0));
        return cats;
    }

    private ArrayList<Human> getHumans() {
        ArrayList<Human> humans = new ArrayList<Human>();
        humans.add(new Human("Pasha", 2, 0));
        humans.add(new Human("Sveta", 6, 0));
        humans.add(new Human("Nina", 11, 0));
        return humans;
    }

    private ArrayList<Robot> getRobots() {
        ArrayList<Robot> robots = new ArrayList<Robot>();
        robots.add(new Robot("R2D2", 2, 0));
        robots.add(new Robot("R2D3", 6, 0));
        robots.add(new Robot("R2D4", 11, 0));
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
