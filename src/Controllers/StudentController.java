package Controllers;

import Models.Student;
import Repository.Repo;

import java.util.List;

/**
 *<h1>Features of the <u>StudentController</u></h1>
 * <li>Add Student Data</li>
 * <li>Get Student Data</li>
 * <li>Update Student Data</li>
 * <li>Delete Student Data</li>
 */

public class StudentController {

    public void addStudentData(String name, int roll, Long regNo, String phoneNumber, String email) {
        Student newStudent = new Student();
        newStudent.setName(name);
        newStudent.setRollNo(roll);
        newStudent.setRegNo(regNo);
        newStudent.setPhoneNumber(phoneNumber);
        newStudent.setEmail(email);

        Repo.studentDatabase.add(newStudent);
    }

    public void showStudents() {
        List<Student> students = Repo.studentDatabase;

        for(Student student : students) {
            System.out.println("Roll: " + student.getRollNo());
            System.out.println("Name: " + student.getName());
        }

    }
}
