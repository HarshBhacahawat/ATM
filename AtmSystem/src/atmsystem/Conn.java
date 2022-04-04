/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Harsh Bhachawat
 */
public class Conn {
    
     static  Connection con;
     public static Connection createC(){
    try{
             Class.forName("com.mysql.cj.jdbc.Driver");  
             String url="jdbc:mysql://localhost:3306/atmsystem";
             String username="root";
             String password ="root";
             
             con = DriverManager.getConnection(url,username,password); 
}
      catch(Exception e)
        {
            System.out.println("error...........");
              e.printStackTrace();
        }
    return con;
     }
    
}
