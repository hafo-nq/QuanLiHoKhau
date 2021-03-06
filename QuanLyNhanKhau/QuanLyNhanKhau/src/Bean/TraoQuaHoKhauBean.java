package Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.HoKhauModel;
import models.LeTetModel;
import models.NhanKhauModel;
import models.ThanhVienCuaHoModel;
import models.UserMoldel;

public class TraoQuaHoKhauBean {
    private HoKhauModel hoKhauModel;
    private NhanKhauModel chuHo;
    private List<NhanKhauModel> listNhanKhauModels;
    private List<ThanhVienCuaHoModel> listThanhVienCuaHo;
    private LeTetModel leTetModel;
    private String trangThaiNhanQua;
    private int soLuongQua;
    private Date ngayNhanQua;
    private UserMoldel nguoiGhiNhan;
    private Date ngayGhiNhan;

    public TraoQuaHoKhauBean(HoKhauModel hoKhauModel, NhanKhauModel chuHo, List<NhanKhauModel> listNhanKhauModels, List<ThanhVienCuaHoModel> listThanhVienCuaHo) {
        this.hoKhauModel = hoKhauModel;
        this.chuHo = chuHo;
        this.listNhanKhauModels = listNhanKhauModels;
        this.listThanhVienCuaHo = listThanhVienCuaHo;
    }
    
    public TraoQuaHoKhauBean() {
        this.hoKhauModel = new HoKhauModel();
        this.chuHo = new NhanKhauModel();
        this.listNhanKhauModels = new ArrayList<>();
        this.listThanhVienCuaHo = new ArrayList<>();
        this.leTetModel = new LeTetModel();
        this.nguoiGhiNhan = new UserMoldel();
    }

    
    public HoKhauModel getHoKhauModel() {
        return hoKhauModel;
    }

    public void setHoKhauModel(HoKhauModel hoKhauModel) {
        this.hoKhauModel = hoKhauModel;
    }

    public NhanKhauModel getChuHo() {
        return chuHo;
    }

    public void setChuHo(NhanKhauModel chuHo) {
        this.chuHo = chuHo;
    }

    public List<NhanKhauModel> getListNhanKhauModels() {
        return listNhanKhauModels;
    }

    public void setListNhanKhauModels(List<NhanKhauModel> listNhanKhauModels) {
        this.listNhanKhauModels = listNhanKhauModels;
    }

    public List<ThanhVienCuaHoModel> getListThanhVienCuaHo() {
        return listThanhVienCuaHo;
    }

    public void setListThanhVienCuaHo(List<ThanhVienCuaHoModel> listThanhVienCuaHo) {
        this.listThanhVienCuaHo = listThanhVienCuaHo;
    }

    @Override
    public String toString() {
        String res = "<html> <style>p {padding: 5px; margin-left: 20px} table, th, td {border: 1px solid black; border-collapse: collapse;} table {width: 500px}</style> <div>"
                + "<h3>Th??ng tin c?? b???n"
                + "<p>M?? h??? kh???u: <b>" + hoKhauModel.getMaHoKhau() + "</p>"
                + "<p>H??? t??n ch??? h???: <b>" + chuHo.getHoTen() + "</p>"
                + "<p>?????a ch???: <b>" + hoKhauModel.getDiaChi() + "</p>"
                + "<p>Ng??y l???p: <b>" + hoKhauModel.getNgayLap().toString() + "</p>"
                + "<h3>Th??ng tin ph??t qu?? c???a h??? v??o d???p " + leTetModel.getTenSuKien() + ", th???i gian " + leTetModel.getThoiGian().toString()
                + "<p>Qu?? c?? b???n: <b>" + leTetModel.getMotSuatQua() + "</p>"
                + "<p>Gi?? tr??? m???t ph???n qu??: <b>" + leTetModel.getTongGiaTriMotSuat() + "</p>"
                + "<p>S??? l?????ng su???t qu??: <b>" + soLuongQua + "</p>"
                + "<p>T???ng gi?? tr??? qu?? c???a h???: <b>" + (long) (soLuongQua * leTetModel.getTongGiaTriMotSuat()) +" ?????ng" + "</p>"
                + "<p>Tr???ng th??i nh???n qu??: <b>" + trangThaiNhanQua + "</p>"
                + "<p>Ng??y nh???n qu??: <b>" + ngayNhanQua + "</p>"
                + "<p>Ng?????i ghi nh???n: <b>" + nguoiGhiNhan.getUserName() + "</p>"
                + "<p>Ng??y ghi nh???n: <b>" + ngayGhiNhan + "</p>"
                + "<h4>Danh s??ch th??nh vi??n<table>"
                + "<tr>"
                + "<th>H??? t??n</th>"
                + "<th>Ng??y sinh</th>"
                + "<th>Gi???i t??nh</th>"
                + "<th>Quan h??? v???i ch??? h???</th>"
                + "</tr>";
        for (int i = 0; i < listNhanKhauModels.size(); i++) {
            res += "<tr>"
                    + "<td>"
                    + listNhanKhauModels.get(i).getHoTen()
                    + "</td>"
                    + "<td>"
                    + listNhanKhauModels.get(i).getNamSinh().toString()
                    + "</td>"
                    + "<td>"
                    + listNhanKhauModels.get(i).getGioiTinh()
                    + "</td>"
                    + "<td>"
                    + listThanhVienCuaHo.get(i).getQuanHeVoiChuHo()
                    + "</td>"
                    + "</tr>";
        }
        res += "</table></div></html>";
        return res;
    }

	public LeTetModel getLeTetModel() {
		return leTetModel;
	}

	public void setLeTetModel(LeTetModel leTetModel) {
		this.leTetModel = leTetModel;
	}

	public String getTrangThaiNhanQua() {
		return trangThaiNhanQua;
	}

	public void setTrangThaiNhanQua(String trangThaiNhanQua) {
		this.trangThaiNhanQua = trangThaiNhanQua;
	}

	public int getSoLuongQua() {
		return soLuongQua;
	}

	public void setSoLuongQua(int soLuongQua) {
		this.soLuongQua = soLuongQua;
	}

	public Date getNgayNhanQua() {
		return ngayNhanQua;
	}

	public void setNgayNhanQua(Date ngayNhanQua) {
		this.ngayNhanQua = ngayNhanQua;
	}

	public UserMoldel getNguoiGhiNhan() {
		return nguoiGhiNhan;
	}

	public void setNguoiGhiNhan(UserMoldel nguoiGhiNhan) {
		this.nguoiGhiNhan = nguoiGhiNhan;
	}

	public Date getNgayGhiNhan() {
		return ngayGhiNhan;
	}

	public void setNgayGhiNhan(Date ngayGhiNhan) {
		this.ngayGhiNhan = ngayGhiNhan;
	}

}
