package menu;

import File.ReadFromFile;
import File.WriteToFile;
import input.Input;
import manage_student.StudentManage;
import src.Student;

import java.io.IOException;

public class Display implements INumber {
    public static void start() throws IOException {
        StudentManage list = new StudentManage();
        WriteToFile listFile = new WriteToFile(list);
        int choice;
        do {
            System.out.println("------MENU------");
            System.out.println("1.Xem danh sách sinh viên \n" +
                    "2. Thêm mơi \n" +
                    "3. Cập nhật \n" +
                    "4. Xóa \n" +
                    "5. Sắp xếp \n" +
                    "6. Đọc từ file \n" +
                    "7. Ghi vào file \n" +
                    "8. Thoát");
            choice = Input.Number();
            switch (choice){
                case SHOWLIST:
                    list.ShowListStudent();
                    break;
                case ADD:
                    System.out.println("Nhập thông tin sinh viên: ");
                    System.out.println("Nhập MSV: ");
                    String id = Input.Code();
                    System.out.println("Nhập tên: ");
                     String name = Input.Name();
                    System.out.println("Nhập Tuổi: ");
                    int age = Input.Age();
                    System.out.println("Nhập Giới tính: ");
                    String gender = Input.Gender();
                    System.out.println("Nhập địa chỉ: ");
                    String addrees = Input.Address();
                    System.out.println("Nhập Điểm Trung Bình:");
                    double score = Input.MediumScore();
                    Student student = new Student(id,name,age,gender,addrees,score);
                    list.addStudent(student);
                    break;
                case UPDATE:
                    list.UpdateStudent();
                    break;
                case REMOVE:
                    String studentCode = Input.Code();
                    list.removeStudent(studentCode);
                    break;
                case SORT:
                    list.sortStudent();
                    break;
                case READ_FROM_FILE:
                    ReadFromFile.ReadFromFile(list);
                    break;
                case WRITE_TO_FILE:
                    WriteToFile.updateToFile();
                    break;
                case EXIST:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }

        }while (choice!= EXIST);
    }
}
