package com.student.manage;

public class Student {
    private  String studentName;
    private int  studentID;
    private String studentPhone;
    private String studentCity;

    public Student(String studentName, int studentID, String studentPhone, String studentCity) {
        super();
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }
    public Student(String studentName, String studentPhone, String studentCity) {
        super();
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student() {
        super();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                ", studentPhone=" + studentPhone +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
