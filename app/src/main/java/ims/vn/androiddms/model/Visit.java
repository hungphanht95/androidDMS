package ims.vn.androiddms.model;

/**
 * Created by phong on 6/22/2017.
 */

public class Visit {
    String detailname,name,address,phone;

    public Visit(){

    }

    public String getDetailname() {
        return detailname;
    }

    public void setDetailname(String detailname) {
        this.detailname = detailname;
    }

    public Visit(String detailname, String name, String address, String phone) {
        this.detailname = detailname;
        this.name = name;
        this.address = address;
        this.phone = phone;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
