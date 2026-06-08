package com.saksham;

public class Student {
    private String name;
    private int rollNo;

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be empty!");
        }
    }
    public String getName() { return name; }

    public void setRollNo(int rollNo) {
        if (rollNo > 0) {
            this.rollNo = rollNo;
        } else {
            System.out.println("Error: Roll number must be positive!");
        }
    }
    public int getRollNo() { return rollNo; }
    
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("--------------------");
    }
}
