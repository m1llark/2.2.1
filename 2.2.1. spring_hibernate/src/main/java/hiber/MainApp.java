package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      User user1 = new User("Vasya", "petrov", "user1@mail.ru");
      User user2 = new User("Petya", "Lastochkin", "user1@mail.ru");
      User user3 = new User("aaaaaaa", "bbbbbbbb", "user1@mail.ru");
      User user4 = new User("ccccccc", "dddddddd", "user1@mail.ru");
      User user5 = new User("Valera", "Smirnoff", "user1@mail.ru");
      User user6 = new User("Serega", "Vasiliev", "user1@mail.ru");


      Car car1 = new Car("BMW", 100);
      Car car2 = new Car("MERSEDEC", 200);
      Car car3 = new Car("AUDI", 300);
      Car car4 = new Car("PORSHE", 400);


      user1.setCar(car1);
      user2.setCar(car2);
      user5.setCar(car3);
      user6.setCar(car4);

      userService.add(user1);
      userService.add(user2);
      userService.add(user3);
      userService.add(user4);
      userService.add(user5);
      userService.add(user6);




      userService.getUserbyCar("BMW", 100);
      userService.getUserbyCar("MERSEDEC", 200);
      userService.getUserbyCar("AUDI", 300);
      userService.getUserbyCar("PORSHE", 400);


//      userService.remove(user1);

//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }
//
     context.close();
   }
}
