package com.tap.nirjala.DBManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import com.tap.nirjala.demo.*;
import com.tap.nirjala.entity.*;
import com.tap.nirjala.UI.*;

public class DBManager
{
    static data data2=new data();
    public static Connection connection;
    public static Statement statement;
    static
    {
        try{
            String URL="jdbc:mysql://localhost:3306/tflecommerce";
            String USERNAME="root";
            String PASSWORD="password";
            connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
            statement=connection.createStatement();
            System.out.println("connection established successfully");
            }       
        catch(SQLException e)
            {
                System.out.println("failed to connect databse");
            }

    }
    public void getAll()
    {
      try{
        String query="select * from products; ";
        ResultSet result=statement.executeQuery(query);
        ResultSetMetaData rsmetadata=result.getMetaData();
        int columncount=rsmetadata.getColumnCount();
        UIManager.displaySelectQuery(rsmetadata,result,columncount);
        result.close();
        return columncount;
        }
      catch(SQLException e)
        {
        System.out.println(e);
        return -1;
        }
    }
    public static int insert()
    {
        UIManager manager2=new UIManager();
        data2=manager2.getData();
        String queryInsert="INSERT INTO tflecommerce(id,name,description.price,stock)values('"+data2.name+"')";
        try
        {
            int rows=statement.executeUpdate(queryInsert);
            return rows;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return -1;
        }
    }
    public static int update()
    {
        UIManager manager=new ULManager();
        data2.manager2.getData();
        String queryUpdate="UPDATE products SET name='"+data2.name+"' WHERE Id="+data2.id+";";
        try
        {
            int rowa=statement.executeUpdate(queryUpdate);
            return rows;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return -1;
        }
    }
    public static int delete()
    {
        UIManager manager2=new UIManager();
        data2=manager2.getData();
        String queryDelete="DELETE FROM products WHERE id="+data2.id+";";
        try{
            int rows=statement.executeUpdate(queryDelete);
            return rows;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return -1;
        }

    }

    public static void close()
    {
        UIManager uimanager=new UIManager();
        try{
            connection .close();
            statement.close();
            uimanager.scanner.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

}