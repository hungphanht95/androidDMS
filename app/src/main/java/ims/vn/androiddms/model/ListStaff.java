package ims.vn.androiddms.model;

/**
 * Created by phong on 6/25/2017.
 */

public class ListStaff {

    String tennv,thoigian,kiemtra,kehoachvt,kehoachdh,thuchienvt,thuchiendh;

    public ListStaff(){

    }
    public ListStaff(String tennv, String thoigian, String kiemtra, String kehoachvt, String kehoachdh, String thuchienvt, String thuchiendh) {
        this.tennv = tennv;
        this.thoigian = thoigian;
        this.kiemtra = kiemtra;
        this.kehoachvt = kehoachvt;
        this.kehoachdh = kehoachdh;
        this.thuchienvt = thuchienvt;
        this.thuchiendh = thuchiendh;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getKiemtra() {
        return kiemtra;
    }

    public void setKiemtra(String kiemtra) {
        this.kiemtra = kiemtra;
    }

    public String getKehoachvt() {
        return kehoachvt;
    }

    public void setKehoachvt(String kehoachvt) {
        this.kehoachvt = kehoachvt;
    }

    public String getKehoachdh() {
        return kehoachdh;
    }

    public void setKehoachdh(String kehoachdh) {
        this.kehoachdh = kehoachdh;
    }

    public String getThuchienvt() {
        return thuchienvt;
    }

    public void setThuchienvt(String thuchienvt) {
        this.thuchienvt = thuchienvt;
    }

    public String getThuchiendh() {
        return thuchiendh;
    }

    public void setThuchiendh(String thuchiendh) {
        this.thuchiendh = thuchiendh;
    }
}
