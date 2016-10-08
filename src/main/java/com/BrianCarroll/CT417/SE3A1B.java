// Test Student Registrations Systems

// Student Id:   12367146
// Student Name: Brian Carroll
// CT417 - Software Engineering III, Assignment 1, Test Harness
//
// September, 2016
//

// Java core packages

package com.BrianCarroll.CT417;

import java.time.*;


// Java extension packages

public class SE3A1B {

    // Student Registration System

    public static void main(String args[]) {

        // Sample Data

        String[][] s = {{"Potter","Harry","12345","1994-10-22"},
                {"Weasley","Ron","12346", "1995-05-29"},
                {"Grainger","Hermione","12347", "1996-12-18"}
        };

        LocalDate dob, start, end;

        // Array of StudentData Objects

        Student[] sd = new Student[3];

        // Populate Array and Print out each item (uses toString)

        start = LocalDate.parse("2016-09-01");
        end = LocalDate.parse("2017-05-31");

        Module m1 = new Module("Software Engineeering III","CT417");
        Module m2 = new Module("Final Year Project","CT413");
        Course c = new Course("BSc in Computer Science","CS101",start, end);

        System.out.println("Student: Surname|Firstname|#ID|DOB|Age|Username");

        for(int i=0;i<s.length;i++) {

            dob = LocalDate.parse((s[i][3]));

            sd[i] = new Student(s[i][0],s[i][1],s[i][2], dob);
            System.out.println(sd[i]);
            m1.addStudent(sd[i]);
            m2.addStudent(sd[i]);
        };


        System.out.println("Module: Module Name|Module #ID|# Students");

        System.out.println(m1);
        System.out.println(m2);

        c.addModule(m1);
        c.addModule(m2);

        System.out.println("Course: Course Name|Course #ID|Start Date|End Date|# Modules");
        System.out.println(c);

        System.out.println("\nProgram completed successfully!");
        System.exit(0);
    }
} // end class SE3A1B