package com.example.lab4a;

public class SanPham {
    int idImg;
    String tenSp;
    String tenShop;

    public SanPham(int idImg, String tenSp, String tenShop) {
        this.idImg = idImg;
        this.tenSp = tenSp;
        this.tenShop = tenShop;
    }

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getTenShop() {
        return tenShop;
    }

    public void setTenShop(String tenShop) {
        this.tenShop = tenShop;
    }
}
