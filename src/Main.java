import Controllers.StudentController;
import Models.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.input();
    }

    void input() throws IOException {
        StudentController studentController = new StudentController();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your choice: ");
        System.out.println("1. Add student data \n" +
                "2. View Students \n" +
                "3. Exit");

        int choice = Integer.parseInt(bufferedReader.readLine());

        if (choice == 1) {
            System.out.println("Enter the name: ");
            String name = bufferedReader.readLine();
            System.out.println("Enter the roll: ");
            int roll = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter the registration number: ");
            Long regNo = Long.parseLong(bufferedReader.readLine());
            System.out.println("Enter the phone number: ");
            String phoneNumber = bufferedReader.readLine();
            System.out.println("Enter the email: ");
            String email = bufferedReader.readLine();

            studentController.addStudentData(name, roll, regNo, phoneNumber, email);
            input();
        } else if (choice == 2) {
            studentController.showStudents();
            input();
        } else if (choice == 3) {
            return;
        } else {
            System.out.println("Not correct choice");
        }
    }
}