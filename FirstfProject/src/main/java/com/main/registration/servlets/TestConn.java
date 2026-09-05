package com.main.registration.servlets;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestConn {
	public static Connection createConnection() {
		Connection connection = null;
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("C:\\Users\\delll\\Desktop\\eclipse\\FirstfProject\\src\\main\\webapp\\abc.properties"));

			Class.forName(properties.getProperty("driver"));
			connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),
					properties.getProperty("password"));
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}


