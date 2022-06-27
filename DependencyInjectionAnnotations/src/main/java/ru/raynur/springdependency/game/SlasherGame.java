package ru.raynur.springdependency.game;

import org.springframework.stereotype.Component;

@Component
public class SlasherGame implements Game {
    @Override
    public String getName() {
        return "God of War";
    }
}
