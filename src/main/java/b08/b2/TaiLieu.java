package b08.b2;

public class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void hienThiThongTin() {
        System.out.println("Mã tài liệu: " + maTaiLieu);
        System.out.println("Tên nhà xuất bản: " + tenNhaXuatBan);
        System.out.println("Số bản phát hành: " + soBanPhatHanh);
    }
}

