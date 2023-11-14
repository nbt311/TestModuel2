package File;

import manage_student.StudentManage;
import src.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {
    public static void ReadFromFile(StudentManage list) throws IOException {
        String line = null;
        FileReader fileReader = new FileReader("File/students.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((line = bufferedReader.readLine()) != null) {
            String[] temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            int age = Integer.parseInt(temp[2]);
            String gender = temp[3];
            String address = temp[4];
            double score = Double.parseDouble(temp[5]);

            Student data = new Student(id, name, age, gender, address, score);
            list.addStudent(data);
        }
        bufferedReader.close();
    }
    }

