package b08.b4;

public class GoodStudent extends Student {
    private double gpa;
    private String bestRewardName;

    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, double gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    @Override
    public void showInfo() {
        System.out.println("Họ tên: " + getFullName());
        System.out.println("Ngày sinh: " + getDoB());
        System.out.println("Giới tính: " + getSex());
        System.out.println("Số điện thoại: " + getPhoneNumber());
        System.out.println("Trường đại học: " + getUniversityName());
        System.out.println("Xếp loại tốt nghiệp: " + getGradeLevel());
        System.out.println("Điểm trung bình học tập (GPA): " + gpa);
        System.out.println("Giải thưởng cao nhất: " + bestRewardName);
    }
}

