package File;
import manage_student.StudentManage;
import src.Student;
import java.io.*;
import java.util.ArrayList;

public class WriteToFile {
    private static StudentManage listStudent;
    public WriteToFile(StudentManage list) {
        this.listStudent = list;
    }
    public static void updateToFile() throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("File/students.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Student student : listStudent.list) {
                line += student.toString();
            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}