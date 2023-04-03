package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {

    public void add(User user);

    public User getUserbyCar(Car car);

    List<User> listUsers();



}


