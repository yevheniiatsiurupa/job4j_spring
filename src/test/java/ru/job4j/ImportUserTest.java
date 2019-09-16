package ru.job4j;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ImportUserTest {
    @Test
    public void whenAddElementsThenFindNewElem() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserStorage storage = context.getBean(UserStorage.class);
        List<User> list = Arrays.asList(new User("user 1"), new User("user 2"));
        ImportUser im = new ImportUser(storage);
        im.importUsers(list);

        List<User> result = storage.findAll();
        assertThat(result.containsAll(list), is(true));
    }
}