package codegym.com.usermanager.service.impl;

import codegym.com.usermanager.model.User;
import codegym.com.usermanager.repository.IUserRepository;
import codegym.com.usermanager.repository.impl.UserRepository;
import codegym.com.usermanager.service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    private IUserRepository repository = new UserRepository();

    @Override
    public void insertUser(User user)  {
        repository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return repository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return repository.selectAllUsers();
    }

    @Override
    public boolean delete(int id)  {
        return repository.delete(id);
    }

    @Override
    public boolean update(User user)  {
        return repository.update(user);
    }

    @Override
    public List<User> search(String value) {
        return repository.search(value);
    }

    @Override
    public void sortByName(List<User> list) {
        repository.sortByName(list);
    }

    @Override
    public void sortByEmail(List<User> list) {
        repository.sortByEmail(list);
    }

    @Override
    public void sortByCountry(List<User> list) {
        repository.sortByCountry(list);
    }
}
