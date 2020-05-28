package usersApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usersApp.entity.User;
import usersApp.repository.UsersRepository;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    UsersRepository usersRepository;

    @Override
    public User getById(long id) {
        return usersRepository.getOne(id);
    }

    @Override
    public void save(User user) {
        usersRepository.save(user);
    }

    @Override
    public void delete(long id) {
        usersRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }
}
