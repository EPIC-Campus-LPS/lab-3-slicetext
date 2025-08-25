package lab3;

public class SpaceTools {

	public static double travelTime(Planet p, double speed) {
		return (p.getDistanceFromSun() * 1000000.0) / speed;
	}
	
	public static Planet compareDistance(Planet a, Planet b) {
		return (a.getDistanceFromSun() > b.getDistanceFromSun()) ? a : b;
	}
	
	public static String abbreviation(Planet p) {
		return p.getName()
				.substring(0, 3)
				.toUpperCase();
	}
	
	private static double getOrbitDistance(Planet p) {
		return (p.getDistanceFromSun() * 2) * Math.PI;
	}
	
	public static double orbitTime(Planet p, double speed) {
		return getOrbitDistance(p) * 1_000_000 / speed;
	}
	public static double orbitTime(Planet p) {
		return getOrbitDistance(p) * 1_000_000 / 100_000;
	}
}
