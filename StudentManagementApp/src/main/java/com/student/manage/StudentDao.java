package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public  class StudentDao {
    public static boolean insertStudentToDb(Student student) {
boolean flag=false;
        // jdbc code ...
        try {

            Connection conn =CP.CreateC();
            // create prepared statement
            PreparedStatement ps = null;
            String q= "insert into students (sname,sphone,scity) values(?,?,?)";
            ps = conn.prepareStatement(q);

            // set the value of the parameter
            ps.setString(1, student.getStudentName());
            ps.setString(2, student.getStudentPhone());
            ps.setString(3, student.getStudentCity());
            //execute
            ps.executeUpdate();
            flag=true;
        }


        catch (Exception e) {
            e.printStackTrace();
        }
        return flag;

    }

    public static boolean deleteStudent(int studentId) {
        boolean flag=false;
        // jdbc code ...
        try {

            Connection conn =CP.CreateC();
            // create prepared statement
            PreparedStatement ps = null;
            String q= "delete from students where sid=?";
            ps = conn.prepareStatement(q);

            // set the value of the parameter
            ps.setInt(1,studentId);

            //execute
            ps.executeUpdate();
            flag=true;
        }


        catch (Exception e) {
            e.printStackTrace();
        }
        return flag;


    }

    public static void displayStudent() {


        // jdbc code ...
        try {

            Connection conn =CP.CreateC();
            // create prepared statement
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from students ;");
            while (rs.next()) {
//                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                System.out.println("Student id : "+rs.getInt(1));
                System.out.println("Student name : "+rs.getString(2));
                System.out.println("Student phone : "+rs.getString(3));
                System.out.println("Student city : "+rs.getString(4));
                System.out.println("***************************************************");

            }

        }


        catch (Exception e) {
            e.printStackTrace();
        }
//        return flag;






    }
}
