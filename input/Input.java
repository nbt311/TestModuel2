package input;

import regex.ExampleRegex;

import java.util.Scanner;

public class Input {
    public static String Code(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            String id = scanner.nextLine();
            try {
                boolean isValid = ExampleRegex.checkStudentCode(id);
                if (isValid){
                    return id;
                }else {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
                }
            }catch (Exception e) {
                System.err.println("Kiểu dữ liệu không hợp lệ, vui lòng nhập lại!");
            }
        }
    }
    public static String Name(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            try {
                boolean isValid = ExampleRegex.checkName(name);
                if (isValid){
                    return name;
                }else {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
                }
            }catch (Exception e) {
                System.err.println("Kiểu dữ liệu không hợp lệ, vui lòng nhập lại!");
            }
        }
    }
    public static int Number(){
        while (true){
            try {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
                return number;
            }catch (NumberFormatException e){
                System.err.println("Kiểu dữ liệu không hợp lệ, vui lòng nhập lại!");
            }
        }
    }
    public static int Age(){
        while (true){
            try {
            Scanner scanner = new Scanner(System.in);
            int age = Integer.parseInt(scanner.nextLine());
                if ( age > 18 && age < 80){
                    return age;
                }else {
                    System.out.println("Tuổi không hợp lệ, vui lòng nhập lại");
                }
            }catch (NumberFormatException e){
            System.err.println("Kiểu dữ liệu không hợp lệ, vui lòng nhập lại!");
        }
        }
    }
    public static String Gender(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            String gender = scanner.nextLine();
            try {
                boolean isValid = ExampleRegex.checkGender(gender);
                if (isValid){
                    return gender;
                }else {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
                }
            }catch (Exception e) {
                System.err.println("Kiểu dữ liệu không hợp lệ, vui lòng nhập lại!");
            }
        }
    }
    public static String Address(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            String address = scanner.nextLine();
            try {
                boolean isValid = ExampleRegex.checkAddress(address);
                if (isValid){
                    return address;
                }else {
                    System.out.println("Định dạng không hợp lệ, vui lòng nhập lại!");
                }
            }catch (Exception e) {
                System.err.println("Kiểu dữ liệu không hợp lệ, vui lòng nhập lại!");
            }
        }
    }
    public static Double MediumScore(){
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                Double score = Double.valueOf(scanner.nextLine());
                if (score >= 0 && score <= 10){
                    return score;
                }else{
                    System.out.println("ĐTB không hợp lệ, vui lòng nhập lại!");
                }
            }catch (NumberFormatException e){
                System.err.println("Kiểu dữ liệu không hợp lệ, vui lòng nhập lại!");
            }
        }
    }

}
