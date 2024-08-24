package b08.b2;

public class Main {
    public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();

        Sach sach1 = new Sach("S001", "NXB Kim Dong", 1000, "J.K. Rowling", 300);
        TapChi tapChi1 = new TapChi("T001", "NXB Tre", 500, 10, 5);
        Bao bao1 = new Bao("B001", "NXB Thanh Nien", 300, "01-08-2023");

        qls.themMoiTaiLieu(sach1);
        qls.themMoiTaiLieu(tapChi1);
        qls.themMoiTaiLieu(bao1);

        System.out.println("Hiển thị thông tin tài liệu:");
        qls.hienThiThongTinTaiLieu();

        System.out.println("Tìm kiếm tài liệu loại Sách:");
        qls.timKiemTheoLoai("Sach");

        System.out.println("Xóa tài liệu mã S001:");
        qls.xoaTaiLieuTheoMa("S001");

        System.out.println("Hiển thị lại thông tin tài liệu:");
        qls.hienThiThongTinTaiLieu();
    }
}

