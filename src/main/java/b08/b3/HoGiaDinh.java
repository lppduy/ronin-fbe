package b08.b3;

public class HoGiaDinh {
    private String hoTenChuHo;
    private String soNha;
    private String maSoCongTo;

    public HoGiaDinh(String hoTenChuHo, String soNha, String maSoCongTo) {
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên chủ hộ: " + hoTenChuHo);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Mã số công tơ: " + maSoCongTo);
    }
}

