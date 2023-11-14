package manage_student;
import File.ReadFromFile;
import File.WriteToFile;
import input.Input;
import print.StudentFormat;
import src.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManage {
    public ArrayList<Student> list = new ArrayList<>();

    public StudentManage() {
        this.list = list;
    }
    public void addStudent(Student student) throws IOException {
        list.add(student);
    }
    public void removeStudent(String id) {
        for (Student student : list) {
            if (student.getStudentCode().equals(id));
            list.remove(student);
        }
    }
    public void UpdateStudent() {
        int choice;
        System.out.println("Nhập mã sinh viên: ");
        String code = Input.Code();
        for (Student student: list) {
            if (student.getStudentCode().equals(code)){
                do {
                    System.out.println("1. Sửa Mã Sinh Viên \n" +
                            "2. Sửa Họ tên \n" +
                            "3. Sửa Tuổi \n" +
                            "4. Sửa Giới tính \n" +
                            "5. Sửa Địa Chỉ \n" +
                            "6. Sửa Điêmn Trung Bình");
                    choice = Input.Number();
                    switch (choice){
                        case 1:
                            editCode(student);
                            return;
                        case 2:
                            editName(student);
                            return;
                        case 3:
                            editAge(student);
                            return;
                        case 4:
                            editGender(student);
                            return;
                        case 5:
                            editAddress(student);
                            return;
                        case 6:
                            editMediumScore(student);
                            return;
                    }
                }while (true);
            }
        }
    }

    private static void editMediumScore(Student student) {
        System.out.println("Nhập diem sinh viên cần sửa");
        double score = Input.MediumScore();
        student.setMediumScore(score);
    }
    private static void editAddress(Student student) {
        System.out.println("Nhập dia chi sinh viên cần sửa");
        String address = Input.Address();
        student.setAddress(address);
    }
    private static void editGender(Student student) {
        System.out.println("Nhập giới tính sinh viên cần sửa");
        String gender = Input.Gender();
        student.setGender(gender);
    }
    private static void editAge(Student student) {
        System.out.println("Nhập tuổi sinh viên cần sửa");
        int age = Input.Age();
        student.setStudentAge(age);
    }
    private static void editName(Student student) {
        System.out.println("Nhập ho tên sinh viên cần sửa");
        String name = Input.Name();
        student.setStudentName(name);
    }
    private static void editCode(Student student) {
        System.out.println("Nhập mã sinh viên cần sửa");
        String id = Input.Code();
        student.setStudentCode(id);
    }

    public void ShowListStudent() throws IOException {
        for(Student student : list){
            System.out.println(student);
            System.out.println("--------------");
        }
    }

    public void sortStudent() throws IOException {
        System.out.println("---- Sap xep sinh vien theo diem trung binh ----");
        System.out.println("Chọn chức năng theo số(để tiếp tục)");
        System.out.println("1. Sắp xếp diem trung binh tang dan");
        System.out.println("2. Sắp xếp diem trung binh giam dan");
        int choose;
        do {
            choose = Input.Number();
            switch (choose) {
                case 1:
                    this.sortIncrease();
                    break;
                case 2:
                    this.sortDecrease();
                    break;
            }
        } while (choose != 3);
    }
    public void sortIncrease() throws IOException {
        Collections.sort(this.list);
        this.ShowListStudent();
    }
    public void sortDecrease() throws IOException {
        Collections.sort(this.list);
        Collections.reverse(this.list);
        this.ShowListStudent();
    }
}
