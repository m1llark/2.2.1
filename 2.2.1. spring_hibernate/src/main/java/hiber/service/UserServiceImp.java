package hiber.service;

import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;
   private Car car;


   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional
   @Override
   public User getUserbyCar(String model,int series) {
      User user = userDao.getUserbyCar(model, series);
      System.out.println(user);
      return user;
   }


   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

//   @Transactional
//   @Override
//   public void remove(User user) {
//      userDao.remove(user);
//   }



}
