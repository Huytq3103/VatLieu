/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import Model.HoaDon;
import java.math.BigDecimal;

/**
 *
 * @author Huy PC
 */
public class ViewDonHang {

    private String id;
    private String tenDon;
    private String nguoiBan;
    private String ngayBan;

    public ViewDonHang(HoaDon hd) {
        this.id = hd.getId();
        this.tenDon = hd.getTen();
        this.nguoiBan = hd.getAccount().getHoTen();
        this.ngayBan = hd.getNgayTao();
        this.tongtien = hd.getTongTien();
        this.TrangThai = hd.getTrangThai();
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }
    private BigDecimal tongtien;
    private int TrangThai;

    public ViewDonHang() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDon() {
        return tenDon;
    }

    public void setTenDon(String tenDon) {
        this.tenDon = tenDon;
    }

    public String getNguoiBan() {
        return nguoiBan;
    }

    public void setNguoiBan(String nguoiBan) {
        this.nguoiBan = nguoiBan;
    }

    public BigDecimal getTongtien() {
        return tongtien;
    }

    public void setTongtien(BigDecimal tongtien) {
        this.tongtien = tongtien;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    private String trangThaiHoaDon() {
        if (TrangThai == 1) {
            return "Đã thanh toán";
        } else {
            return "Chưa thanh toán";
        }
    }

    public Object[] toDataRow(int i) {
        return new Object[]{i, tenDon, nguoiBan, ngayBan, tongtien, trangThaiHoaDon()};
    }
}
