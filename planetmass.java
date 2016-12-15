import java.util.*;

public class CompiledJava {
  public static void main(String[] args) {
    for(int i = 0; i < 9; i++) {
      if (i == 0) {
        double sunMass = 1.9 * Math.pow(10, 30);
        System.out.println("The Sun has a mass of " + sunMass +" kg.");
      }
      if (i == 1) {
        double mercuryMass = 3.3 * Math.pow(10, 23);
        System.out.println("Mercury has a mass of " + mercuryMass +" kg.");
      }
      if (i == 2) {
        double venusMass = 4.8 * Math.pow(10, 24);
        System.out.println("Venus has a mass of " + venusMass +" kg.");
      }
      if (i == 3) {
        double earthMass = 5.9 * Math.pow(10, 24);
        System.out.println("Earth has a mass of " + earthMass +" kg.");
      }
      if (i == 4) {
        double marsMass = 6.4 * Math.pow(10, 23);
        System.out.println("Mars has a mass of " + marsMass +" kg.");
      }
      if (i == 5) {
        double jupiterMass = 1.9 * Math.pow(10, 27);
        System.out.println("Jupiter has a mass of " + jupiterMass +" kg.");
      }
      if (i == 6) {
        double saturnMass = 5.6 * Math.pow(10, 26);
        System.out.println("Saturn has a mass of " + saturnMass +" kg.");
      }
      if (i == 7) {
        double uranusMass = 8.6 * Math.pow(10, 25);
        System.out.println("Uranus has a mass of " + uranusMass +" kg.");
      }
      if (i == 8) {
        double neptuneMass = 1.2 * Math.pow(10, 26);
        System.out.println("Neptune has a mass of " + neptuneMass +" kg.");
      }
    }
  }
}
