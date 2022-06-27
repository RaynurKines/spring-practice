package ru.raynur.springdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.raynur.springdependency.game.Game;

@Component
public class GamesLauncher {
    private Game game;
    private String version;

    @Autowired
    public GamesLauncher(Game game) {
        this.game = game;
        this.version = "v1.0";
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void launch() {
        System.out.println("Playing: " + game.getName() + "\nversion: " + getVersion());
    }
}
