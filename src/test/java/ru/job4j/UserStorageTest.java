package ru.job4j;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class UserStorageTest {
    @Test
    public void whenLoadContextThenGetBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserStorage storage = context.getBean(UserStorage.class);
        assertThat(storage != null, is(true));
    }
}