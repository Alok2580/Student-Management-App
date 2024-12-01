package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    public static Connection CreateC(){

        Connection con=null;

        try{
            // load the driver

            Class.forName("com.mysql.cj.jdbc.Driver");

            //create the connection

            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","Alok1729@");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return con;

    }
}

