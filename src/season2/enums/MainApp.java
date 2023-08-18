package season2.enums;

public class MainApp {
    public static void main(String[] args) {
        Planet planet = Planet.Mars;
        for (Planet p : Planet.values()) {
            System.out.println(p+ " "+ p.getRusName()+ " имеет спутников: " + p.getSatelliteCount());
        }

//        testPlanet(planet);
//        System.out.println(planet.compareTo(Planet.Neptune));

    }

    public static void testPlanet(Planet p) {
        switch (p) {
            case Mercury:
            case Venus:
            case Earth:
            case Mars:
                System.out.println("Малая планета");
                break;
            default:
                System.out.println("Большая планета");
        }
    }
}
