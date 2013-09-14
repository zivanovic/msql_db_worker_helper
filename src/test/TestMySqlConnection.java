/*
 */
package test;

import logic.connection.mysql.MySqlConnection;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class TestMySqlConnection {
     public static void main(String args[]) {
         MySqlConnection msc= new MySqlConnection("root", "root", "jdbc:mysql://localhost:3306/test");
         msc.connect();
         msc.executeUpdate("CREATE DATABASE databasename");
         msc.disconnect();
     }
}
