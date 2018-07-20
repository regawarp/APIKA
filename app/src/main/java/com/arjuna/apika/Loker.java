package com.arjuna.apika;

import java.util.Date;

/**
 * Created by Regawa on 6/29/2018.
 */

public class Loker {
    private String judul;
    private String fee;
    private String location;
    private String dayPosted;

    Loker(String judul, String fee, String location, String dayPosted){
        this.judul=judul;
        this.fee=fee;
        this.location=location;
        this.dayPosted=dayPosted;
    }
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDayPosted() {
        return dayPosted;
    }

    public void setDayPosted(String dayPosted) {
        this.dayPosted = dayPosted;
    }
}
