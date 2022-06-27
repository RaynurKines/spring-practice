package ru.raynur.springdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private String id;
    private GamesLauncher gamesLauncher;

    @Autowired
    public Computer(GamesLauncher steamLauncher) {
        this.id = "DESKTOP_RAYNUR";
        this.gamesLauncher = steamLauncher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GamesLauncher getGamesLauncher() {
        return gamesLauncher;
    }

    public void setGamesLauncher(GamesLauncher gamesLauncher) {
        this.gamesLauncher = gamesLauncher;
    }
}
