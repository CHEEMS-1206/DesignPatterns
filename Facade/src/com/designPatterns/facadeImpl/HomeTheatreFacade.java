package com.designPatterns.facadeImpl;

import com.designPatterns.facade.Facade;
import com.designPatterns.subSystemClasses.*;

public class HomeTheatreFacade implements Facade {
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;
    private Lights lights;
    private Screen screen;

    public HomeTheatreFacade(Amplifier amp, DVDPlayer dvd, Projector projector, Lights lights, Screen screen) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("\n---- Starting Movie Mode ----");
        lights.dim();
        screen.down();
        projector.on();
        projector.setInput(dvd);
        amp.on();
        dvd.on();
        dvd.play(movie);
        System.out.println("Enjoy your movie!\n");
    }

    public void endMovie() {
        System.out.println("\n---- Shutting Down Movie Mode ----");
        dvd.off();
        amp.off();
        projector.off();
        screen.up();
        lights.on();
        System.out.println("Movie ended. Goodbye!\n");
    }
}

