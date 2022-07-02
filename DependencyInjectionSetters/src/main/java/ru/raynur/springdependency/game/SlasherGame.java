package ru.raynur.springdependency.game;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SlasherGame implements Game {
    private final List<String> titles = new ArrayList<>();

    {
        titles.add("God of War");
        titles.add("Darksiders");
        titles.add("Castlevania");
    }

    @Override
    public List<String> getTitles() {
        return titles;
    }
}
