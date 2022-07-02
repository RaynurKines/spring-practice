package ru.raynur.springdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.raynur.springdependency.game.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
@Scope(scopeName = "singleton") //prototype
public class GamesLauncher {
    private final SlasherGame slasherGame;
    private final ShooterGame shooterGame;
    private final StrategyGame strategyGame;

    @Autowired
    public GamesLauncher(SlasherGame slasherGame, ShooterGame shooterGame, StrategyGame strategyGame) {
        this.slasherGame = slasherGame;
        this.shooterGame = shooterGame;
        this.strategyGame = strategyGame;
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Created singleton bean - Games Launcher");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Deleted singleton bean - Games Launcher");
    }

    public void launch(GameGenre gameGenre) {
        Random random = new Random();
        switch (gameGenre) {
            case SLASHER_GAME -> System.out.println(slasherGame.getTitles().get(random.nextInt(3)));
            case SHOOTER_GAME -> System.out.println(shooterGame.getTitles().get(random.nextInt(3)));
            case STRATEGY_GAME -> System.out.println(strategyGame.getTitles().get(random.nextInt(3)));
            default -> System.out.println("Not defined genre");
        }
    }
}
