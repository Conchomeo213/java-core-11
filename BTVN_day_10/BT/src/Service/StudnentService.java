package Service;

import Model.Student;

import java.util.*;
import java.util.List;

public class StudnentService extends Student{
    private ArrayList<Student> students;

    public StudnentService() {
        init();
    }

    private void init() {
        students = new ArrayList<>();
        students.add(new Student(1, "Do Hieu", 19, "Ha Noi", 10, "13A"));
        students.add(new Student(2, "Khanh Linh", 19, "Ha Noi", 10, "13A"));
        students.add(new Student(3, "Bui Hien", 25, "Ha Noi ", 9, "13B"));
        students.add(new Student(4, "Con Vuon", 18, "Da So", 9, "13B"));
        students.add(new Student(5, "Ha linh", 21, "Nghe AN ", 8, "13C"));
        students.add(new Student(6, "Thanh Huyen", 20, "Ha Noi", 8, "13C"));
    }

    // Trả Về danh sách sinh viên
    public ArrayList<Student> getStudents() {
        return students;
    }

    // In ra thông tin sinh viên
    public void printInfo(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    // Thêm Sinh viên mới
    public Student addstudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id :");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap ten :");
        String name = sc.nextLine();

        System.out.println("Nhap tuoi : ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap dia chi :");
        String address = sc.nextLine();

        System.out.println("Nhap diem : ");
        int point = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap lop hoc :");
        String classroom = sc.nextLine();

        Student student = new Student(id, name, age, address, point, classroom);
        students.add(student);
        return student;

    }

    // Cập nhật điểm học sinh
    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Xóa sinh vien theo id
    public void deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
            }
        }
    }

    // Xem danh sách sinh viên theo lớp
    public ArrayList<Student> findByClass(String classroom) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student s : students) {
            if (s.getClassroom().toLowerCase(Locale.ROOT).contains(classroom.toLowerCase(Locale.ROOT))) {
                list.add(s);
            }
        }
        return list;
    }

    // Sắp xếp theo tên
    public ArrayList<Student> sortByName() {

        List<Student> list =students;
        list.sort(Comparator.comparing(student -> ((Student) student).getName()));
        list.forEach(student -> System.out.println(student.toString()));
        return (ArrayList<Student>) list;
    }

    // Sắp xếp theo tuổi
    public ArrayList<Student> sortByAge() {
        List<Student> list = students;
        list.sort((Comparator.comparing(student -> ((Student)student).getAge()).thenComparing(student ->((Student)student)
                .getId())));
        list.forEach(student -> System.out.println(student.toString()));
        return (ArrayList<Student>) list;
    }

    // Sắp xếp theo điểm
    public ArrayList<Student> sortByPoint() {
        List<Student> list = students;
        list.sort(Comparator.comparing(student -> ((Student) student).getPoint()));
        list.forEach(student -> System.out.println(student.toString()));
        return (ArrayList<Student>) list;
    }
}
