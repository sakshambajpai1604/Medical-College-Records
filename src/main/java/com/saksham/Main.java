package com.saksham;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setName("Ananya Mehta"); s1.setRollNo(101);
        s2.setName("Karthik Rao"); s2.setRollNo(102);
        s3.setName("Fatima Sheikh"); s3.setRollNo(103);

        System.out.println("=== Medical College Student Records ===");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}