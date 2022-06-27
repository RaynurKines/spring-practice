package ru.raynur.springdependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Computer computer = context.getBean("computer", Computer.class);
        GamesLauncher app = computer.getGamesLauncher();
        app.launch();
        System.out.println(computer.getId());


        context.close();
    }
}
