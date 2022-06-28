package ru.raynur.springdependency.game;

import org.springframework.stereotype.Component;

@Component
public class StrategyGame implements Game {
    @Override
    public String getName() {
        return "Civilization VI";
    }
}
