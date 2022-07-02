package ru.raynur.springdependency.game;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShooterGame implements Game {
    private final List<String> titles = new ArrayList<>();

    {
        titles.add("Titanfall 2");
        titles.add("Counter Strike: Source");
        titles.add("Escape from Tarkov");
    }

    @Override
    public List<String> getTitles() {
        return titles;
    }
}
