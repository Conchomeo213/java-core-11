package Controller;

import Model.Student;
import Service.StudnentService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentController extends Student {
    private final StudnentService studentService = new StudnentService();

    public void run() {
        Scanner sc = new Scanner(System.in);

        boolean isContinue = true;
        int option = 0;

        while (isContinue) {
            printMenu();

            System.out.print("Nhap lua chon : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    ArrayList<Student> students = studentService.getStudents();
                    if (students.isEmpty()) {
                        System.out.println("Khong co sinh vien nao trong danh sach !");
                    } else {
                        System.out.println("Danh sach sinh vien :");
                        studentService.printInfo(students);
                    }
                    break;
                }
                case 2: {
                    Student student = studentService.addstudent();
                    System.out.println("sinh vien vua them la :");
                    System.out.println(student);
                    break;
                }
                case 3: {
                    System.out.println("Nhap id sinh vien :");
                    int id = Integer.parseInt(sc.nextLine());

                    Student student = studentService.findById(id);
                    if (student == null) {
                        System.out.println("Khong co sinh vien nao co " + id + " hop le !");
                    } else {
                        System.out.println("Nhap diem :");
                        int point = Integer.parseInt(sc.nextLine());
                        student.setPoint(point);
                        System.out.println(student);
                    }
                    break;
                }
                case 4: {
                    System.out.print("Nhập id : ");
                    int id = Integer.parseInt(sc.nextLine());

                    Student student = studentService.findById(id);
                    if (student == null) {
                        System.out.println("Khong co sinh vien nao co " + id + " hop le !");
                    } else {
                        studentService.deleteStudent(id);
                        System.out.println("Da xoa thanh cong sinh vien co id :" + id);
                    }
                    break;
                }
                case 5: {
                    System.out.print("Nhap lop : ");
                    String classroom = sc.nextLine();

                    ArrayList<Student> students = studentService.findByClass(classroom);
                    if (students.isEmpty()) {
                        System.out.println("Khong co sinh vien nao trong danh sach !");
                    } else {
                        System.out.println("Nhung sinh vien trong lop " + classroom + "bao gom :");
                        studentService.printInfo(students);
                    }
                    break;
                }
                case 6: {
                    ArrayList<Student> students = studentService.sortByName();
                    if (students.isEmpty()) {
                        System.out.println("Khong co sinh vien nao trong danh sach da sap xep!");
                    } else {
                        System.out.println("Danh sach sinh vien da sap xep bao gom:");
                        studentService.printInfo(students);
                    }
                    break;
                }
                case 7 : {
                    ArrayList<Student> students = studentService.sortByAge();
                    studentService.printInfo(students);
                    break;
                }
                case 8 : {
                    ArrayList<Student> students = studentService.sortByPoint();
                    studentService.printInfo(students);
                    break;
                }
                case 9: {
                    isContinue = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không phù hợp");
                    break;
                }

            }
        }
    }

    private void printMenu() {
        System.out.println("/********** Menu ********");
        System.out.println("1.Xem danh sach sinh vien");
        System.out.println("2.Them sinh vien moi");
        System.out.println("3.Cap nhat diem sinh vien");
        System.out.println("4.Xoa hoc sinh");
        System.out.println("5.Xem danh sach hoc sinh theo lop");
        System.out.println("6.Sap xep theo ten");
        System.out.println("7.Sap xep theo tuoi");
        System.out.println("8.Sap xep theo diem");
        System.out.println("9.Thoat chuong trinh");
    }
}
