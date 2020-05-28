package usersApp.service;

import usersApp.entity.User;

import java.util.List;

public interface UserService {
    User getById(long id);
    void save(User user);
    void delete(long id);
    List<User> getAllUsers();
}
