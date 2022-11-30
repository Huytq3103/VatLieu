/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author Huy PC
 */
public class HoaDonChiTiet {

    private SanPham sp;
    private String idHoaDon;
    private String tenSP;
    private String hang;
    private String loai;
    private String donViTinh;
    private double soLuong;
    private BigDecimal donGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(SanPham sp, String idHoaDon, String tenSP, String hang, String loai, String donViTinh, double soLuong, BigDecimal donGia) {
        this.sp = sp;
        this.idHoaDon = idHoaDon;
        this.tenSP = tenSP;
        this.hang = hang;
        this.loai = loai;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }
    public Object[] toDataRow(int i){
        return new Object[]{i,tenSP,hang,loai,donViTinh,soLuong,donGia};
    }
}
