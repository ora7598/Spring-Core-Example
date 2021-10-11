package com.jb.app;
import com.jb.beans.Todo;
import com.jb.config.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoreApplication {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Todo todo = container.getBean(Todo.class);
        todo.setId(1L);
        todo.setTitle("A title");
        todo.setDescription("A Description");

        System.out.println(todo);
    }
}
