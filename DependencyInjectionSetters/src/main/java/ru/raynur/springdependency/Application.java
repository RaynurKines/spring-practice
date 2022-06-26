package ru.raynur.springdependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        GamesLauncher app = context.getBean("gamesLauncher", GamesLauncher.class);
        app.launch();

        context.close();
    }
}
