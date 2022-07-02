package ru.raynur.springdependency.game;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StrategyGame implements Game {
    private final List<String> titles = new ArrayList<>();

    {
        titles.add("Civilization VI");
        titles.add("Mount & Blade");
        titles.add("StarCraft");
    }

    @Override
    public List<String> getTitles() {
        return titles;
    }
}
