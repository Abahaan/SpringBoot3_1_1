package ru.kokov.SpringBoot.dao;




import ru.kokov.SpringBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User show(int id);
    void update(int id, User updatedUser);
    void delete(int id);

    void save(User user);


}
