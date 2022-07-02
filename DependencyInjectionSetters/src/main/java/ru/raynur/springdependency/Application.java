package ru.raynur.springdependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.raynur.springdependency.config.SpringConfig;
import ru.raynur.springdependency.game.GameGenre;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        GamesLauncher app = context.getBean("gamesLauncher", GamesLauncher.class);
        app.launch(GameGenre.SHOOTER_GAME);
        app.launch(GameGenre.SLASHER_GAME);

        context.close();
    }
}
