package b08.b1;

import java.util.ArrayList;
import java.util.List;

public class QLCB {
    private List<CanBo> danhSachCanBo;

    public QLCB() {
        this.danhSachCanBo = new ArrayList<>();
    }

    public void themMoiCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }

    public void timKiemTheoHoTen(String hoTen) {
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getHoTen().equalsIgnoreCase(hoTen)) {
                canBo.hienThiThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy cán bộ với họ tên: " + hoTen);
    }

    public void hienThiDanhSachCanBo() {
        for (CanBo canBo : danhSachCanBo) {
            canBo.hienThiThongTin();
            System.out.println("-------------------------");
        }
    }
}

