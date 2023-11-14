package print;

import src.Student;

public class StudentFormat {
    public static String infoStudent(Student student){
        return student.getStudentCode() +
                "," + student.getStudentName() +
                "," + student.getStudentAge() +
                "," + student.getGender() +
                "," + student.getAddress() +
                "," + student.getMediumScore();
    }
}
