package lab3;

public class Planet {
    private String name;
    private double distanceFromSun; // in millions of km

    public Planet(String name, double distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }
    
    public String toString() {
    	return name;
    }

    public String getName() { return name; }
    public double getDistanceFromSun() { return distanceFromSun; }
}