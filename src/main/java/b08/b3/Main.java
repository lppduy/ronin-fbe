package b08.b3;

public class Main {
    public static void main(String[] args) {
        HoGiaDinh hoGiaDinh1 = new HoGiaDinh("Nguyen Van A", "123 Pho Hue", "CT001");
        BienLai bienLai1 = new BienLai(hoGiaDinh1, 100, 150);

        HoGiaDinh hoGiaDinh2 = new HoGiaDinh("Tran Thi B", "456 Le Loi", "CT002");
        BienLai bienLai2 = new BienLai(hoGiaDinh2, 200, 250);

        QuanLyBienLai qlbl = new QuanLyBienLai();
        qlbl.themBienLai(bienLai1);
        qlbl.themBienLai(bienLai2);

        System.out.println("Hiển thị tất cả các biên lai:");
        qlbl.hienThiTatCaBienLai();

        System.out.println("Sửa thông tin chủ hộ có mã số công tơ CT002:");
        qlbl.suaThongTinChuHo("CT002", "Le Thi C", "789 Tran Phu");

        System.out.println("Hiển thị lại tất cả các biên lai:");
        qlbl.hienThiTatCaBienLai();

        System.out.println("Xóa biên lai có mã số công tơ CT001:");
        qlbl.xoaBienLaiTheoMaSoCongTo("CT001");

        System.out.println("Hiển thị lại tất cả các biên lai:");
        qlbl.hienThiTatCaBienLai();
    }
}

