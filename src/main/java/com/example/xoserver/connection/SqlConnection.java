package com.example.xoserver.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Lớp này quản lý kết nối tới cơ sở dữ liệu MySQL.
 */
public class SqlConnection {
    public static Connection connection;

    static {
        try {
            // Thiết lập kết nối tới cơ sở dữ liệu MySQL
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xo_schema", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
