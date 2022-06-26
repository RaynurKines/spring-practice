package ru.raynur.springdependency;

import ru.raynur.springdependency.game.Game;

import java.util.Arrays;
import java.util.List;

public class GamesLauncher {
    private List<Game> games;

    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public void launch() {
        System.out.println("Playing: " + Arrays.toString(games.stream().map(Game::getName).toArray()) + "\nversion: " + getVersion());
    }
}
