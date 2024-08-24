package b08.b3;

import java.util.ArrayList;
import java.util.List;

public class QuanLyBienLai {
    private List<BienLai> danhSachBienLai;

    public QuanLyBienLai() {
        this.danhSachBienLai = new ArrayList<>();
    }

    public void themBienLai(BienLai bienLai) {
        danhSachBienLai.add(bienLai);
    }

    public void xoaBienLaiTheoMaSoCongTo(String maSoCongTo) {
        danhSachBienLai.removeIf(bienLai -> bienLai.hoGiaDinh.getMaSoCongTo().equals(maSoCongTo));
    }

    public void suaThongTinChuHo(String maSoCongTo, String tenMoi, String soNhaMoi) {
        for (BienLai bienLai : danhSachBienLai) {
            if (bienLai.hoGiaDinh.getMaSoCongTo().equals(maSoCongTo)) {
                bienLai.hoGiaDinh.setHoTenChuHo(tenMoi);
                bienLai.hoGiaDinh.setSoNha(soNhaMoi);
                break;
            }
        }
    }

    public void hienThiTatCaBienLai() {
        for (BienLai bienLai : danhSachBienLai) {
            bienLai.hienThiThongTinBienLai();
            System.out.println("-------------------------");
        }
    }
}

