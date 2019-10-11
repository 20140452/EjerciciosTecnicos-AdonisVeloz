package problems.problema2.entitities;

public class City {
    private String name;
    private Point cordinates;

    public City(String name, Point cordinates) {
        this.name = name;
        this.cordinates = cordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getCordinates() {
        return cordinates;
    }

    public void setCordinates(Point cordinates) {
        this.cordinates = cordinates;
    }
}
