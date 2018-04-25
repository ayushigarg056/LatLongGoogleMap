package com.ayushi.user.mapactivity.model;

/**
 * Created by user on 26-Apr-18.
 */

public class LatLng {
    double lat;
    double lon;

    public LatLng(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

}
