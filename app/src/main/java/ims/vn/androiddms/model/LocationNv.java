package ims.vn.androiddms.model;

/**
 * Created by Deleting on 6/28/2017.
 */

public class LocationNv {
    public String getNameposition() {
        return Nameposition;
    }

    public void setNameposition(String nameposition) {
        Nameposition = nameposition;
    }

    public Double getLat() {
        return Lat;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public Double getLeg() {
        return Leg;
    }

    public void setLeg(Double leg) {
        Leg = leg;
    }

    private String Nameposition;
    private Double Lat;
    private Double Leg;

}
