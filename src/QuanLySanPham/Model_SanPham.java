/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySanPham;

/**
 *
 * @author admin
 */
public class Model_SanPham {
    private String maSP;
    private String tenSP;
    private float giaTien;
    private String moTa;
    private String trangThai;
    private String maDanhMuc;

    public Model_SanPham() {
    }

    public Model_SanPham(String maSP, String tenSP, float giaTien, String moTa, String trangThai, String maDanhMuc) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaTien = giaTien;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.maDanhMuc = maDanhMuc;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }
    
    public Object[] toDataRow(){
        return new Object[]{this.getMaSP(),this.getTenSP(),this.getGiaTien(),this.getMoTa(),this.getTrangThai(),this.getMaDanhMuc()};
    }
}
