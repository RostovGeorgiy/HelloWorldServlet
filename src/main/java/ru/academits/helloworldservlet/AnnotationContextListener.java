package ru.academits.helloworldservlet;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@SuppressWarnings("unused")
@WebListener
public class AnnotationContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Контекст приложения успешно создан.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Контекст приложения уничтожен.");
    }
}