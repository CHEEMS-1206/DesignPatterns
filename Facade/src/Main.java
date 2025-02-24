import com.designPatterns.facadeImpl.HomeTheatreFacade;
import com.designPatterns.subSystemClasses.*;

public class Main {
    public static void main(String[] args) {
        // Create subsystem components
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();
        Screen screen = new Screen();

        // Create Facade
        HomeTheatreFacade homeTheater = new HomeTheatreFacade(amp, dvd, projector, lights, screen);

        // Use simplified interface
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
