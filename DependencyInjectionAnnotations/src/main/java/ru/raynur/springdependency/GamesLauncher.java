package ru.raynur.springdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.raynur.springdependency.game.Game;

@Component
public class GamesLauncher {
    /*@Autowired
    @Qualifier(value = "shooterGame")*/
    private Game game1;
    private Game game2;
    private String version;

    @Autowired
    public GamesLauncher(@Qualifier(value = "shooterGame") Game game1,
                         @Qualifier(value = "slasherGame") Game game2) {
        this.game1 = game1;
        this.game2 = game2;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void launch() {
        System.out.println("Playing: " + game1.getName() + "\nPlaying next: " + game2.getName() + "\nversion: " + getVersion());
    }
}
