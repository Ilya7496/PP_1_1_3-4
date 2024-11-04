package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URl = "jdbc:mysql://localhost:3306/user";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "Uiop2901";
    public static  Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URl, LOGIN, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Соединение не установлено");;
        }
        return connection;
    }// реализуйте настройку соеденения с БД
}
