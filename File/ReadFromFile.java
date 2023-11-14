package File;

import manage_student.StudentManage;
import src.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {
    public static void ReadFromFile(StudentManage list) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("File/students.csv"))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                    String id = parts[0];
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    String gender = parts[3];
                    String address = parts[4];
                    Double score = Double.parseDouble(parts[5]);
                    Student student = new Student(id,name,age,gender,address,score);
                    list.addStudent(student);
                }
            }
        }
    }

