package ru.liskovchuk.dao;

import ru.liskovchuk.model.User;

import java.util.List;

public interface UserDao {

    List<User> index();
    User indexCount(int id);
    void save(User user);
    void update(int id, User updated);
    void delete(int id);



}