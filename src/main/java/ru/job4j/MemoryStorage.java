package ru.job4j;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryStorage implements Storage {
    private List<User> list = new ArrayList<User>();

    public void add(User user) {
        this.list.add(user);
    }

    public List<User> findAll() {
        return this.list;
    }
}
