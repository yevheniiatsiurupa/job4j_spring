package ru.job4j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class ImportUser {
    private UserStorage storage;

    public ImportUser(UserStorage storage) {
        this.storage = storage;
    }

    public void importUsers(List<User> forImport) {
        for (User tmp : forImport) {
            this.storage.add(tmp);
        }
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserStorage storage = context.getBean(UserStorage.class);
        List<User> list = Arrays.asList(new User("user 3"), new User("user 4"));
        ImportUser im = new ImportUser(storage);
        im.importUsers(list);
    }
}
