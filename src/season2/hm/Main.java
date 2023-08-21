package season2.hm;

public class Main {


    public static void main(String[] args) {
        JumpoRun[] j = {
                new Bot("XX99PRO"),
                new Cat("Chipap"),
                new Human("Molodoy Artizi"),
        };
        Obstacles[] o = {
                new Treadmill(30),
                new Treadmill(90),
                new Treadmill(110),
                new Wall(9),
                new Wall(19),
                new Wall(39),
        };

        for (JumpoRun competitor : j) {
            for (Obstacles obstacle : o) {
                if (!obstacle.overcome(competitor, obstacle)) {
                    break;
                }

            }

        }
    }
}
