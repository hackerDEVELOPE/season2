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

        for (int i = 0; i < j.length; i++) {
            for (Obstacles obstacles : o) {
                if (!o[i].overcome(j[i], obstacles)) {
                    break;
                }

            }

        }
    }
}
