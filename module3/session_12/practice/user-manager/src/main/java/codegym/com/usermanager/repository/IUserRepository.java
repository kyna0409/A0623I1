package codegym.com.usermanager.repository;

import codegym.com.usermanager.model.User;

import java.util.List;

public interface IUserRepository {
    public void insertUser(User user);

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean delete(int id) ;

    public boolean update(User user);
    public List<User> search(String value);
    public void sortByName(List<User> list);
    public void sortByEmail(List<User> list);
    public void sortByCountry(List<User> list);
}
