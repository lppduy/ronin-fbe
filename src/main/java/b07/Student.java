package b07;

public class Student {
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String studentID;

    public Student() {
    }

    public Student(String name, String address, String email, String phoneNumber, String studentID) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void attendClass() {
        System.out.println(name + " đang đi học.");
    }

    public void doHomework() {
        System.out.println(name + " đang làm bài tập.");
    }

    public void payTuitionFee() {
        System.out.println(name + " đã nộp học phí.");
    }

    public void takeExam() {
        System.out.println(name + " đang làm bài kiểm tra.");
    }

    public void showFullInformation() {
        System.out.println("Thông tin sinh viên:");
        System.out.println("Họ tên: " + name);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println("Mã sinh viên: " + studentID);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Nguyễn Văn A", "123 Đường ABC, Hà Nội", "nguyenvana@example.com", "0123456789", "B22DCCN175");

        student1.attendClass();
        student1.doHomework();
        student1.payTuitionFee();
        student1.takeExam();

        student1.showFullInformation();
    }
}
