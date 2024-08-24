package b08.b2;

import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private List<TaiLieu> danhSachTaiLieu;

    public QuanLySach() {
        this.danhSachTaiLieu = new ArrayList<>();
    }

    public void themMoiTaiLieu(TaiLieu taiLieu) {
        danhSachTaiLieu.add(taiLieu);
    }

    public void xoaTaiLieuTheoMa(String maTaiLieu) {
        danhSachTaiLieu.removeIf(taiLieu -> taiLieu.getMaTaiLieu().equals(maTaiLieu));
    }

    public void hienThiThongTinTaiLieu() {
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            taiLieu.hienThiThongTin();
            System.out.println("-------------------------");
        }
    }

    public void timKiemTheoLoai(String loai) {
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if ((loai.equalsIgnoreCase("Sach") && taiLieu instanceof Sach) ||
                    (loai.equalsIgnoreCase("TapChi") && taiLieu instanceof TapChi) ||
                    (loai.equalsIgnoreCase("Bao") && taiLieu instanceof Bao)) {
                taiLieu.hienThiThongTin();
                System.out.println("-------------------------");
            }
        }
    }
}

