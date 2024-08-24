package b08.b3;

public class BienLai {
    HoGiaDinh hoGiaDinh;
    private int chiSoCu;
    private int chiSoMoi;
    private int soTienPhaiTra;

    public BienLai(HoGiaDinh hoGiaDinh, int chiSoCu, int chiSoMoi) {
        this.hoGiaDinh = hoGiaDinh;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.soTienPhaiTra = tinhTienDien();
    }

    public int tinhTienDien() {
        return (chiSoMoi - chiSoCu) * 5;
    }

    public void hienThiThongTinBienLai() {
        hoGiaDinh.hienThiThongTin();
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Số tiền phải trả: " + soTienPhaiTra);
    }
}

