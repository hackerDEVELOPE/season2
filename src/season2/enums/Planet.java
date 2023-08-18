package season2.enums;

public enum Planet {
    Mercury("Меркурий", 0),
    Venus("Венера", 0),
    Earth("Земля", 1),
    Mars("Марс", 2),
    Jupiter("Юпитер", 15),
    Saturn("Сатурн", 16),
    Uranus("Уран", 5),
    Neptune("Нептун", 2);
    private String rusName;
    private int satelliteCount;

    Planet(String rusName, int satelliteCount) {
        this.rusName = rusName;
        this.satelliteCount = satelliteCount;
    }

    public String getRusName() {
        return rusName;
    }

    public int getSatelliteCount() {
        return satelliteCount;
    }
}
