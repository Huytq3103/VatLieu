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
public class ChiTietSanPham {

    private String id;
    private SanPham sp;
    private Hang hang;
    private Loai loai;
    private String donViTinh;
    private double soLuongTon;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;
    private String ngayNhap;
    private String ngayChinhSua;

    public ChiTietSanPham(String id, SanPham sp, Hang hang, Loai loai, String donViTinh, double soLuongTon, BigDecimal giaNhap, BigDecimal giaBan, String ngayNhap, String ngayChinhSua) {
        this.id = id;
        this.sp = sp;
        this.hang = hang;
        this.loai = loai;
        this.donViTinh = donViTinh;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.ngayNhap = ngayNhap;
        this.ngayChinhSua = ngayChinhSua;
    }

    public ChiTietSanPham() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public Hang getHang() {
        return hang;
    }

    public void setHang(Hang hang) {
        this.hang = hang;
    }

    public Loai getLoai() {
        return loai;
    }

    public void setLoai(Loai loai) {
        this.loai = loai;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public double getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(double soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayChinhSua() {
        return ngayChinhSua;
    }

    public void setNgayChinhSua(String ngayChinhSua) {
        this.ngayChinhSua = ngayChinhSua;
    }

    public Object[] toDataRow() {
        return new Object[]{id, sp.getTenSP(), hang.getTen(), loai.getTen(), donViTinh, soLuongTon, giaBan, ngayNhap};
    }

}
