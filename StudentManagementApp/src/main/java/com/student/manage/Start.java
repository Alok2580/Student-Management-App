package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        while(true){
            System.out.println("Please select an option:");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Edit Student");
            System.out.println("4. View Students");
            System.out.println("5. Exit Program");

            int option = Integer.parseInt(br.readLine());
            if(option ==1){
                System.out.println("Enter student name:");
                String name = br.readLine();
                System.out.println("Enter student Phone Number:");
                String phone = br.readLine();
                System.out.println("Enter student City:");
                String city = br.readLine();
                Student stud = new Student(name,phone,city);
               boolean status= StudentDao.insertStudentToDb(stud);
               if(status){
                   System.out.println("Student added successfully");
               }
               else{

                   System.out.println("error in adding student");
               }

            }

            else if(option ==2){
                //delete
                System.out.println("Enter student ID:");
                int studentId = Integer.parseInt(br.readLine());
               boolean status= StudentDao.deleteStudent(studentId);
               if(status){
                   System.out.println("Student deleted successfully");
               }
               else{
                   System.out.println("error in deleting student");
               }


            }

            else if(option ==4){
//                System.out.println("Enter student ID:");
//                int studentId = Integer.parseInt(br.readLine());
                StudentDao.displayStudent();

            }
            else if(option ==5){

                break;

            }
            else{
                System.out.println("Invalid option");
            }


        }

        System.out.println("thank you for using Student Management App");
        System.out.println("See you soon ... bye bye");

    }
}
