package ru.raynur.springdependency.game;

import org.springframework.stereotype.Component;

@Component
public class ShooterGame implements Game {

    @Override
    public String getName() {
        return "Titanfall 2";
    }
}
