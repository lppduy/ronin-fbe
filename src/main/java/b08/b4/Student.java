package b08.b4;

public abstract class Student {
    private String fullName;
    private String doB; // Date of Birth
    private String sex;
    private String phoneNumber;
    private String universityName;
    private String gradeLevel;

    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDoB() {
        return doB;
    }

    public String getSex() {
        return sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public abstract void showInfo(); // Phương thức trừu tượng để hiển thị thông tin sinh viên
}

