package com.example.demo_app_doc_truyen.Model;

public class User {
    String hoten , matkhau , nhaplaimk , sdt ;
    public User(String hoten, String matkhau, String nhaplaimk, String sdt) {
        this.hoten = hoten;
        this.matkhau = matkhau;
        this.nhaplaimk = nhaplaimk;
        this.sdt = sdt;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getNhaplaimk() {
        return nhaplaimk;
    }

    public void setNhaplaimk(String nhaplaimk) {
        this.nhaplaimk = nhaplaimk;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
