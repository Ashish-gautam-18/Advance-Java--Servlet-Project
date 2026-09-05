package com.main.registration.servlets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static final String SELECT_ALL_USERS = "SELECT * FROM login";

    public static int save(String email, String username, String password, String mobileNo, String totalQual,
            String gender, String totalTech, String country, String totalAddrs, String review) {
        int rowCount = 0;
        try(Connection connection = TestConn.createConnection();) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO login VALUES(?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, mobileNo);
            preparedStatement.setString(5, totalQual);
            preparedStatement.setString(6, gender);
            preparedStatement.setString(7, totalTech);
            preparedStatement.setString(8, country);
            preparedStatement.setString(9, totalAddrs);
            preparedStatement.setString(10, review);
            rowCount = preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowCount;
    }

    public static List<User> selectAllUsers() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List<User> users = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            // System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String email = rs.getString(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String mobileNo = rs.getString(4);
                String totalQual = rs.getString(5);
                String gender = rs.getString(6);
                String totalTech = rs.getString(7);
                String country = rs.getString(8);
                String totalAddrs = rs.getString(9);
                String review = rs.getString(10);
                users.add(new User(email, username, password, mobileNo, totalQual, gender, totalTech, country,
                        totalAddrs, review));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return users;
    }

    private static void printSQLException(SQLException e) {
        e.printStackTrace();
    }

    private static Connection getConnection() {
    	Connection connection = TestConn.createConnection();
    	return connection;
    }

    public static boolean loginCheck(String username, String password) {

        try(Connection connection = TestConn.createConnection();) {
            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM login");

            while (set.next()) {
                String db_username = set.getString(2);
                String db_password = set.getString(3);				
				if (db_username.equals(username) && db_password.equals(password)) {
					
					return true;
				} 
			}
		

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;

	}

	public static User search(String mobileNo, String password) {
		User user = null; 
		try(Connection connection = TestConn.createConnection();) {			
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery("select * from login where mobileNo='"+mobileNo+"'and password='"+password+"'");
						
			set.next();
			user = new User(set.getString(1),set.getString(2),set.getString(3),set.getString(4),
					set.getString(5),set.getString(6),set.getString(7),set.getString(8),set.getString(9),set.getString(10));
		} catch (SQLException e) {

			e.printStackTrace();
		}		
		return user;		
	}

	public static boolean delete(String username) {
		int count=0;
		try(Connection connection = TestConn.createConnection();) {
			Statement statement=connection.createStatement();
			 count=statement.executeUpdate("delete from login where username='"+username+"'");
			
			 if(count!=0) {
				 return true;
			 }
		} catch (Exception e) {
           e.printStackTrace();
		}
		return false;
	}

	public static boolean resetPassword(String email, String password) {
		int count=0;
		try(Connection connection = TestConn.createConnection();) {
		Statement statement=connection.createStatement();
		 count=statement.executeUpdate("update  login set password='"+password+"' where email='"+email+"'");		 
		 if(count==1) {
			 return true;
				
			}
		}
		
		catch (Exception e) {
            e.printStackTrace();
		}
		return false;
	}

	public static String[] view1() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String[] view11() {
		// TODO Auto-generated method stub
		return null;
	}
	public static User editUser(String uname) {

        // using try-with-resources to avoid closing resources (boiler plate code)
		User user=null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement("select * from login where username='"+uname+"'");) {
            // System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String email = rs.getString(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String mobileNo = rs.getString(4);
                String totalQual = rs.getString(5);
                String gender = rs.getString(6);
                String totalTech = rs.getString(7);
                String country = rs.getString(8);
                String totalAddrs = rs.getString(9);
                String review = rs.getString(10);
                user=new User(email, username, password, mobileNo, totalQual, gender, totalTech, country,
                        totalAddrs, review);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
    }
	public static boolean updateProfile(String uname, String email,String username,String password,String number) {
		int count=0;
		try(Connection connection = TestConn.createConnection();Statement statement=connection.createStatement();) {
		 count=statement.executeUpdate("UPDATE login "
		 		+ "SET email ='"+email+"',"
		 		+ "username ='"+username+"',"
		 		+ "password ='"+password+"',"
		 		+ "mobileNo ='"+number+"'"
		 		+ "WHERE username='"+uname+"'");
		 System.out.println(uname);
		 System.out.println(count);
		 if(count!=0) {
			 return true;
				
			}
		}
		
		catch (Exception e) {
            e.printStackTrace();
		}
		return false;
	}
	}