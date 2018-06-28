package com.arjuna.apika;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Regawa on 6/28/2018.
 */

public class Event {

    private String judul;
    private String tanggal;
    private String tempat;

    Event(String judul, String tanggal, String tempat) {
        this.setJudul(judul);
        this.setTanggal(tanggal);
        this.setTempat(tempat);
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }



}
