package b08.b4;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Encapsulation (Bao đóng):
 * Tất cả các thuộc tính của Student, GoodStudent, và NormalStudent
 * đều được khai báo là private, chỉ có thể truy cập thông qua các phương thức getter.
 * 2. Inheritance (Kế thừa):
 * GoodStudent và NormalStudent đều kế thừa từ lớp Student,
 * tận dụng các thuộc tính và phương thức đã có.
 * 3. Polymorphism (Đa hình):
 * Cả GoodStudent và NormalStudent đều ghi đè phương thức showInfo()
 * để hiển thị thông tin chi tiết của từng loại sinh viên.
 * Trong lớp Main, ta sử dụng danh sách List<Student> để quản lý
 * cả GoodStudent và NormalStudent, và gọi phương thức showInfo() một cách đa hình.
 * 4. Abstraction (Trừu tượng):
 * Lớp Student là lớp trừu tượng với phương thức showInfo()
 * được khai báo trừu tượng, buộc các lớp con phải triển khai cụ thể.
 */

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        GoodStudent goodStudent1 = new GoodStudent("Nguyen Van A", "01/01/1998", "Nam", "0123456789", "Dai hoc Bach Khoa", "Gioi", 9.0, "Hoc bong A");
        GoodStudent goodStudent2 = new GoodStudent("Le Thi B", "02/02/1997", "Nu", "0987654321", "Dai hoc Kinh Te", "Kha", 8.5, "Hoc bong B");

        NormalStudent normalStudent1 = new NormalStudent("Pham Van C", "03/03/1996", "Nam", "0912345678", "Dai hoc Su Pham", "Trung binh", 750, 7.0);
        NormalStudent normalStudent2 = new NormalStudent("Tran Thi D", "04/04/1999", "Nu", "0908765432", "Dai hoc Nong Lam", "Trung binh", 800, 6.5);

        students.add(goodStudent1);
        students.add(goodStudent2);
        students.add(normalStudent1);
        students.add(normalStudent2);

        for (Student student : students) {
            student.showInfo();
            System.out.println("-------------------------");
        }
    }
}

