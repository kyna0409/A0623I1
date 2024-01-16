package codegym.com.usermanager.repository.impl;

import codegym.com.usermanager.model.User;
import codegym.com.usermanager.repository.BaseRepository;
import codegym.com.usermanager.repository.IUserRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserRepository implements IUserRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public void insertUser(User user) {
        try{
            String sql ="insert into users(name, email, country) values(?,?,?)";
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch (SQLException e) {
            System.out.println("loi ket noi !");
        }
    }



    @Override
    public User selectUser(int id) {
        User user = null;
        String sql = "select name, email, country from users where id =?";
        try{
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id,name,email,country);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        try{
            String sql ="select * from users";
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                User user = new User(id,name,email,country);
                users.add(user);
            }
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("loi ket noi !");
        }
        return users;
    }

    @Override
    public boolean delete(int id)  {
        boolean rowDeleted = false;
        try{
            String sql ="delete from users where id=?";
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1,id);
            System.out.println(preparedStatement.executeUpdate());
            rowDeleted = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("loi ket noi !");
        }
        return rowDeleted;
    }

    @Override
    public boolean update(User user)  {
        boolean rowUpdated;
        try{
            String sql ="update users set name = ?, email=?, country=? where id=?";
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement(sql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            preparedStatement.setInt(4,user.getId());
            rowUpdated = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("loi ket noi !");
        }
        return false;
    }

    @Override
    public List<User> search(String value) {
        List<User>userList = new ArrayList<>();
        for (User user:selectAllUsers()) {
            if(user.getName().toLowerCase().contains(value.toLowerCase())
                    ||user.getEmail().toLowerCase().contains(value.toLowerCase())
                    ||user.getCountry().toLowerCase().contains(value.toLowerCase())){
                userList.add(user);
            }
        }
        return userList;
    }

    @Override
    public void sortByName(List<User> list) {
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
            }
        });
    }
    public static void main(String[] args) throws SQLException {
        IUserRepository repository = new UserRepository();
        List<User> list = repository.selectAllUsers();
        repository.sortByCountry(list);
        System.out.println(list);

    }

    @Override
    public void sortByEmail(List<User> list) {
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                    return o1.getEmail().toLowerCase().compareTo(o2.getEmail().toLowerCase());
            }
        });
    }

    @Override
    public void sortByCountry(List<User> list) {
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getCountry().toLowerCase().compareTo(o2.getCountry().toLowerCase());
            }
        });
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
