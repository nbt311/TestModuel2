package src;

import print.StudentFormat;

public class Student implements Comparable<Student> {
    private String studentCode;
    private String studentName;
    private  int studentAge;
    private  String gender;
    private String Address;
    private Double mediumScore;

    public Student(String studentCode, String studentName, int studentAge, String gender, String address, Double mediumScore) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.gender = gender;
        Address = address;
        this.mediumScore = mediumScore;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(Double mediumScore) {
        this.mediumScore = mediumScore;
    }
    @Override
    public String toString() {
        return StudentFormat.infoStudent(this);
    }

    @Override
    public int compareTo(Student student) {
        return this.getMediumScore().compareTo(student.getMediumScore());
    }
}
