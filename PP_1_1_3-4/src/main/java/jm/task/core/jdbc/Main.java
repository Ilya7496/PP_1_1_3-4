package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class  Main {
    private static final UserService userService = new UserServiceImpl();
    private static final User user1 = new User("Ilya", "Mikhailov", (byte) 28);
    private static final User user2 = new User("Alexander", "Gaponenko", (byte) 27);
    private static final User user3 = new User("Danil","Shalahinov", (byte) 27);
    private static final User user4 = new User("Leonid","Zakharov", (byte) 28);

    public static void main(String[] args) {
        userService.cleanUsersTable();
        userService.saveUser("Ilya", "Mikhailov", (byte) 28);
        userService.saveUser("Alexander", "Gaponenko", (byte) 27);
        userService.saveUser("Danil","Shalahinov", (byte) 27);
        userService.saveUser("Leonid","Zakharov", (byte) 28);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable(); // реализуйте алгоритм здесь
    }
}
