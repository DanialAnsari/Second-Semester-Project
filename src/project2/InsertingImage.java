/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Sameer
 */
public class InsertingImage {
    String path;
    Connection con;
    Statement st;
    ResultSet rs;
    static Scanner obj = new Scanner(System.in);

    public void Disconnect(){
        try{
        st.close();
        con.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);    
        }
    }

     public void Connect()
    {
       try{
    path="jdbc:ucanaccess://C:\\Users\\Sameer\\Documents\\Database3.accdb ";
    con=DriverManager.getConnection(path);
    st=con.createStatement();
}
catch 
(Exception ex) 
        { 
            System.out.println(ex); 
        } 

    }
     
    void Insert(String text,String i) throws FileNotFoundException, SQLException{
        
      {
      
        System.out.println("Inserting ......." );
        try{
                  st.executeUpdate("INSERT INTO Project (Encrypt,Image) VALUES('"+text+"','"+i+"')");
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}  
    
    public String SelectAll (String text)
    {
        String image="";
        try{
            System.out.println("\nSeleting Data ...........................");
            
            rs = st.executeQuery("SELECT Image FROM Project WHERE Encrypt='"+text+"'");
            while(rs.next()){
           image=rs.getString("Image");
            };
        }

        catch (Exception ex)
        {
            System.out.println(ex);
        }

return image;

    }

     void getCode() throws SQLException{
        rs =st.executeQuery("SELECT * \n" +"FROM table_name\n" +"ORDER BY id DESC\n" +"LIMIT 1");
        System.out.println(rs.getInt("ID"));
    }
}
