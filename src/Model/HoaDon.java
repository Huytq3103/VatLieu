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
public class HoaDon {

    private String id;
    private Account account;
    private KhachHang kh;
    private int trangThai;
    private String ten;
    private String ngayTao;
    private String ngayThanhToan;
    private String ngayShip;
    private String ngayNhan;
    private BigDecimal tongTien;
    private String ngayChinhSua;
    private String nguoiChinhSua;

    public HoaDon() {
    }

    public HoaDon(String id, Account account, KhachHang kh, int trangThai, String ten, String ngayTao, String ngayThanhToan, String ngayShip, String ngayNhan, BigDecimal tongTien, String ngayChinhSua, String nguoiChinhSua) {
        this.id = id;
        this.account = account;
        this.kh = kh;
        this.trangThai = trangThai;
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.tongTien = tongTien;
        this.ngayChinhSua = ngayChinhSua;
        this.nguoiChinhSua = nguoiChinhSua;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(String ngayShip) {
        this.ngayShip = ngayShip;
    }

    public String getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(String ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public String getNgayChinhSua() {
        return ngayChinhSua;
    }

    public void setNgayChinhSua(String ngayChinhSua) {
        this.ngayChinhSua = ngayChinhSua;
    }

    public String getNguoiChinhSua() {
        return nguoiChinhSua;
    }

    public void setNguoiChinhSua(String nguoiChinhSua) {
        this.nguoiChinhSua = nguoiChinhSua;
    }

    public Object[] toDataRow(int i) {
        return new Object[]{i, ten, ngayTao, account.getHoTen(), tongTien, trangThai == 1 ? "Đã thanh toán" : "Chưa thanh toán"};
    }
}
