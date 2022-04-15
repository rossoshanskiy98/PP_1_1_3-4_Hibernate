package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Иван", "Иванов", (byte) 11);
        userService.saveUser("Петр", "Петров", (byte) 22);
        userService.saveUser("Алексей", "Алексеев", (byte) 44);
        userService.saveUser("Илья", "Муромец", (byte) 33);
        List <User> list = userService.getAllUsers();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
