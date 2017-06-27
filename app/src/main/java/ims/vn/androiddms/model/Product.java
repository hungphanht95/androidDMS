package ims.vn.androiddms.model;

/**
 * Created by phong on 6/24/2017.
 */

public class Product {
    String tensp,giachan,giale,tonchan,tonle;

    public Product(){

    }

    public Product(String tensp, String giachan, String giale, String tonchan, String tonle) {
        this.tensp = tensp;
        this.giachan = giachan;
        this.giale = giale;
        this.tonchan = tonchan;
        this.tonle = tonle;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getGiachan() {
        return giachan;
    }

    public void setGiachan(String giachan) {
        this.giachan = giachan;
    }

    public String getGiale() {
        return giale;
    }

    public void setGiale(String giale) {
        this.giale = giale;
    }

    public String getTonchan() {
        return tonchan;
    }

    public void setTonchan(String tonchan) {
        this.tonchan = tonchan;
    }

    public String getTonle() {
        return tonle;
    }

    public void setTonle(String tonle) {
        this.tonle = tonle;
    }
}
