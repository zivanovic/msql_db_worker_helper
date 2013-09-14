/*
 */
package logic.connection.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import log.Log;

/**
 *
 * @author Zoran Zivanovic <zoran86zz at yahoo.com>
 */
public class MySqlConnection
{

    private String username;
    private String password;
    private String url;
    Connection connection;

    public MySqlConnection(String username, String password, String url)
    {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public String getDatabaseName()
    {
        String ret_val=new String(url);
        String arr[]= ret_val.split("/");
        ret_val = arr[arr.length-1];
        
        return ret_val;
    }
    public boolean connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            Log.logi("Connection established url"+ url);
        } catch (ClassNotFoundException | SQLException e)
        {
            Log.loge("Couldnt get connection url"+ url);
            return false;
        }

        return true;
    }
    public boolean disconnect()
    {
        try
        {
            connection.close();
            Log.logi("Connection closed");
            return true;
        } catch (SQLException ex)
        {
            Log.loge(ex.getMessage());
        }
        return false;
    }
    public Connection getConnection()
    {
        return connection;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getUrl()
    {
        return url;
    }
    public boolean executeUpdate(String sql)
    {
        Statement st;
        try
        {
            Log.logi("Start execution.");
            st = connection.createStatement();
            st.executeUpdate(sql);
            st.close();
            Log.logi("End execution.");
            return true;

        } catch (SQLException ex)
        {
            Log.loge(ex.getMessage());
        }

        return false;
    }
    private ResultSet executeQuery(String sql)
    {
        ResultSet retres;
        Statement st;
        try
        {
            Log.logi("Start execution.");
            st = connection.createStatement();
            retres = st.executeQuery(sql);
           // st.close();
            Log.logi("End execution.");
            return retres;
        } catch (SQLException ex)
        {
            Log.loge(ex.getMessage());
        }
        
        return null;
    }
}
