package hiber.service;


import hiber.model.User;

import java.util.List;

public interface UserService {

    public void add(User user);

    public User getUserbyCar(String model, int series);

    List<User> listUsers();

//    public void remove(User user);



}


