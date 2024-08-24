package b08.b1;

public class Main {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();

        CongNhan cn1 = new CongNhan("Nguyen Van A", 30, "Nam", "Hanoi", 5);
        KySu ks1 = new KySu("Tran Thi B", 28, "Nu", "Hanoi", "CNTT");
        NhanVien nv1 = new NhanVien("Le Van C", 25, "Khac", "HCM", "Ke toan");

        qlcb.themMoiCanBo(cn1);
        qlcb.themMoiCanBo(ks1);
        qlcb.themMoiCanBo(nv1);

        System.out.println("Tìm kiếm cán bộ theo họ tên:");
        qlcb.timKiemTheoHoTen("Tran Thi B");

        System.out.println("\nHiển thị danh sách cán bộ:");
        qlcb.hienThiDanhSachCanBo();
    }
}
